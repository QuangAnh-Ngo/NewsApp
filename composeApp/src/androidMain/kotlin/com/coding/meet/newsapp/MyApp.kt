package com.coding.meet.newsapp
import androidx.datastore.preferences.preferencesDataStoreFile
import android.app.Application
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.room.Room
import com.coding.meet.newsapp.data.database.NewsDatabase
import com.coding.meet.newsapp.di.initKoin
import com.coding.meet.newsapp.utils.AppPreferences
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.dsl.module

class MyApp : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger()
            androidContext(this@MyApp)

            // --- THÊM ĐOẠN NÀY ---
            // Vì ta đã tắt module lỗi ở commonMain, giờ ta khai báo lại ở đây
            modules(
                module {
                    // 1. Khởi tạo Room Database (Kiểu Android truyền thống)
                    single<NewsDatabase> {
                        Room.databaseBuilder(
                            this@MyApp, // Context
                            NewsDatabase::class.java,
                            "news.db"
                        )
                            .fallbackToDestructiveMigration() // Xóa dữ liệu cũ nếu đổi cấu trúc bảng
                            .build()
                    }

                    // 2. Cung cấp DAO (để Repository dùng)
                    single { get<NewsDatabase>().newsDao() }

                    // 3. Khởi tạo DataStore (Lưu cài đặt)
                    single {
                        PreferenceDataStoreFactory.create {
                            this@MyApp.preferencesDataStoreFile("settings.preferences_pb")
                        }
                    }

                    // 4. Cung cấp AppPreferences
                    single { AppPreferences(get()) }
                }
            )
            // ---------------------
        }
    }
}