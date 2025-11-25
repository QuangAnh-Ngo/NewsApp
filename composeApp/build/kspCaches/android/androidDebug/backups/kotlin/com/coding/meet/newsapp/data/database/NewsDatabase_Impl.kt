package com.coding.meet.newsapp.`data`.database

import androidx.room.InvalidationTracker
import androidx.room.RoomOpenDelegate
import androidx.room.migration.AutoMigrationSpec
import androidx.room.migration.Migration
import androidx.room.util.TableInfo
import androidx.room.util.TableInfo.Companion.read
import androidx.room.util.dropFtsSyncTriggers
import androidx.sqlite.SQLiteConnection
import androidx.sqlite.execSQL
import javax.`annotation`.processing.Generated
import kotlin.Lazy
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.MutableSet
import kotlin.collections.Set
import kotlin.collections.mutableListOf
import kotlin.collections.mutableMapOf
import kotlin.collections.mutableSetOf
import kotlin.reflect.KClass

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class NewsDatabase_Impl : NewsDatabase() {
  private val _newsDao: Lazy<NewsDao> = lazy {
    NewsDao_Impl(this)
  }

  protected override fun createOpenDelegate(): RoomOpenDelegate {
    val _openDelegate: RoomOpenDelegate = object : RoomOpenDelegate(1,
        "b1dca59eea858254ec20d0726c92696c", "1cfa16bc616552b56ec9c534a5bd394b") {
      public override fun createAllTables(connection: SQLiteConnection) {
        connection.execSQL("CREATE TABLE IF NOT EXISTS `articleTable` (`author` TEXT, `content` TEXT, `description` TEXT, `articleId` TEXT NOT NULL, `source` TEXT NOT NULL, `title` TEXT NOT NULL, `url` TEXT NOT NULL, `urlToImage` TEXT, PRIMARY KEY(`articleId`))")
        connection.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)")
        connection.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b1dca59eea858254ec20d0726c92696c')")
      }

      public override fun dropAllTables(connection: SQLiteConnection) {
        connection.execSQL("DROP TABLE IF EXISTS `articleTable`")
      }

      public override fun onCreate(connection: SQLiteConnection) {
      }

      public override fun onOpen(connection: SQLiteConnection) {
        internalInitInvalidationTracker(connection)
      }

      public override fun onPreMigrate(connection: SQLiteConnection) {
        dropFtsSyncTriggers(connection)
      }

      public override fun onPostMigrate(connection: SQLiteConnection) {
      }

      public override fun onValidateSchema(connection: SQLiteConnection):
          RoomOpenDelegate.ValidationResult {
        val _columnsArticleTable: MutableMap<String, TableInfo.Column> = mutableMapOf()
        _columnsArticleTable.put("author", TableInfo.Column("author", "TEXT", false, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsArticleTable.put("content", TableInfo.Column("content", "TEXT", false, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsArticleTable.put("description", TableInfo.Column("description", "TEXT", false, 0,
            null, TableInfo.CREATED_FROM_ENTITY))
        _columnsArticleTable.put("articleId", TableInfo.Column("articleId", "TEXT", true, 1, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsArticleTable.put("source", TableInfo.Column("source", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsArticleTable.put("title", TableInfo.Column("title", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsArticleTable.put("url", TableInfo.Column("url", "TEXT", true, 0, null,
            TableInfo.CREATED_FROM_ENTITY))
        _columnsArticleTable.put("urlToImage", TableInfo.Column("urlToImage", "TEXT", false, 0,
            null, TableInfo.CREATED_FROM_ENTITY))
        val _foreignKeysArticleTable: MutableSet<TableInfo.ForeignKey> = mutableSetOf()
        val _indicesArticleTable: MutableSet<TableInfo.Index> = mutableSetOf()
        val _infoArticleTable: TableInfo = TableInfo("articleTable", _columnsArticleTable,
            _foreignKeysArticleTable, _indicesArticleTable)
        val _existingArticleTable: TableInfo = read(connection, "articleTable")
        if (!_infoArticleTable.equals(_existingArticleTable)) {
          return RoomOpenDelegate.ValidationResult(false, """
              |articleTable(com.coding.meet.newsapp.data.model.Article).
              | Expected:
              |""".trimMargin() + _infoArticleTable + """
              |
              | Found:
              |""".trimMargin() + _existingArticleTable)
        }
        return RoomOpenDelegate.ValidationResult(true, null)
      }
    }
    return _openDelegate
  }

  protected override fun createInvalidationTracker(): InvalidationTracker {
    val _shadowTablesMap: MutableMap<String, String> = mutableMapOf()
    val _viewTables: MutableMap<String, Set<String>> = mutableMapOf()
    return InvalidationTracker(this, _shadowTablesMap, _viewTables, "articleTable")
  }

  public override fun clearAllTables() {
    super.performClear(false, "articleTable")
  }

  protected override fun getRequiredTypeConverterClasses(): Map<KClass<*>, List<KClass<*>>> {
    val _typeConvertersMap: MutableMap<KClass<*>, List<KClass<*>>> = mutableMapOf()
    _typeConvertersMap.put(NewsDao::class, NewsDao_Impl.getRequiredConverters())
    return _typeConvertersMap
  }

  public override fun getRequiredAutoMigrationSpecClasses(): Set<KClass<out AutoMigrationSpec>> {
    val _autoMigrationSpecsSet: MutableSet<KClass<out AutoMigrationSpec>> = mutableSetOf()
    return _autoMigrationSpecsSet
  }

  public override
      fun createAutoMigrations(autoMigrationSpecs: Map<KClass<out AutoMigrationSpec>, AutoMigrationSpec>):
      List<Migration> {
    val _autoMigrations: MutableList<Migration> = mutableListOf()
    return _autoMigrations
  }

  public override fun newsDao(): NewsDao = _newsDao.value
}
