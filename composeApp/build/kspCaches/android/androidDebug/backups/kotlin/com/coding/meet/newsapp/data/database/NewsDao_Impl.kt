package com.coding.meet.newsapp.`data`.database

import androidx.room.EntityDeleteOrUpdateAdapter
import androidx.room.EntityInsertAdapter
import androidx.room.RoomDatabase
import androidx.room.coroutines.createFlow
import androidx.room.util.getColumnIndexOrThrow
import androidx.room.util.performSuspending
import androidx.sqlite.SQLiteStatement
import com.coding.meet.newsapp.`data`.model.Article
import com.coding.meet.newsapp.`data`.model.Source
import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.collections.mutableListOf
import kotlin.reflect.KClass
import kotlinx.coroutines.flow.Flow

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class NewsDao_Impl(
  __db: RoomDatabase,
) : NewsDao {
  private val __db: RoomDatabase

  private val __insertAdapterOfArticle: EntityInsertAdapter<Article>

  private val __sourceTypeConverter: SourceTypeConverter = SourceTypeConverter()

  private val __deleteAdapterOfArticle: EntityDeleteOrUpdateAdapter<Article>
  init {
    this.__db = __db
    this.__insertAdapterOfArticle = object : EntityInsertAdapter<Article>() {
      protected override fun createQuery(): String =
          "INSERT OR REPLACE INTO `articleTable` (`author`,`content`,`description`,`articleId`,`source`,`title`,`url`,`urlToImage`) VALUES (?,?,?,?,?,?,?,?)"

      protected override fun bind(statement: SQLiteStatement, entity: Article) {
        val _tmpAuthor: String? = entity.author
        if (_tmpAuthor == null) {
          statement.bindNull(1)
        } else {
          statement.bindText(1, _tmpAuthor)
        }
        val _tmpContent: String? = entity.content
        if (_tmpContent == null) {
          statement.bindNull(2)
        } else {
          statement.bindText(2, _tmpContent)
        }
        val _tmpDescription: String? = entity.description
        if (_tmpDescription == null) {
          statement.bindNull(3)
        } else {
          statement.bindText(3, _tmpDescription)
        }
        statement.bindText(4, entity.publishedAt)
        val _tmp: String = __sourceTypeConverter.fromSourceToString(entity.source)
        statement.bindText(5, _tmp)
        statement.bindText(6, entity.title)
        statement.bindText(7, entity.url)
        val _tmpUrlToImage: String? = entity.urlToImage
        if (_tmpUrlToImage == null) {
          statement.bindNull(8)
        } else {
          statement.bindText(8, _tmpUrlToImage)
        }
      }
    }
    this.__deleteAdapterOfArticle = object : EntityDeleteOrUpdateAdapter<Article>() {
      protected override fun createQuery(): String =
          "DELETE FROM `articleTable` WHERE `articleId` = ?"

      protected override fun bind(statement: SQLiteStatement, entity: Article) {
        statement.bindText(1, entity.publishedAt)
      }
    }
  }

  public override suspend fun upsert(article: Article): Unit = performSuspending(__db, false, true)
      { _connection ->
    __insertAdapterOfArticle.insert(_connection, article)
  }

  public override suspend fun delete(article: Article): Unit = performSuspending(__db, false, true)
      { _connection ->
    __deleteAdapterOfArticle.handle(_connection, article)
  }

  public override fun getArticles(): Flow<List<Article>> {
    val _sql: String = "SELECT * FROM articleTable"
    return createFlow(__db, false, arrayOf("articleTable")) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _columnIndexOfAuthor: Int = getColumnIndexOrThrow(_stmt, "author")
        val _columnIndexOfContent: Int = getColumnIndexOrThrow(_stmt, "content")
        val _columnIndexOfDescription: Int = getColumnIndexOrThrow(_stmt, "description")
        val _columnIndexOfPublishedAt: Int = getColumnIndexOrThrow(_stmt, "articleId")
        val _columnIndexOfSource: Int = getColumnIndexOrThrow(_stmt, "source")
        val _columnIndexOfTitle: Int = getColumnIndexOrThrow(_stmt, "title")
        val _columnIndexOfUrl: Int = getColumnIndexOrThrow(_stmt, "url")
        val _columnIndexOfUrlToImage: Int = getColumnIndexOrThrow(_stmt, "urlToImage")
        val _result: MutableList<Article> = mutableListOf()
        while (_stmt.step()) {
          val _item: Article
          val _tmpAuthor: String?
          if (_stmt.isNull(_columnIndexOfAuthor)) {
            _tmpAuthor = null
          } else {
            _tmpAuthor = _stmt.getText(_columnIndexOfAuthor)
          }
          val _tmpContent: String?
          if (_stmt.isNull(_columnIndexOfContent)) {
            _tmpContent = null
          } else {
            _tmpContent = _stmt.getText(_columnIndexOfContent)
          }
          val _tmpDescription: String?
          if (_stmt.isNull(_columnIndexOfDescription)) {
            _tmpDescription = null
          } else {
            _tmpDescription = _stmt.getText(_columnIndexOfDescription)
          }
          val _tmpPublishedAt: String
          _tmpPublishedAt = _stmt.getText(_columnIndexOfPublishedAt)
          val _tmpSource: Source
          val _tmp: String
          _tmp = _stmt.getText(_columnIndexOfSource)
          _tmpSource = __sourceTypeConverter.fromStringToSource(_tmp)
          val _tmpTitle: String
          _tmpTitle = _stmt.getText(_columnIndexOfTitle)
          val _tmpUrl: String
          _tmpUrl = _stmt.getText(_columnIndexOfUrl)
          val _tmpUrlToImage: String?
          if (_stmt.isNull(_columnIndexOfUrlToImage)) {
            _tmpUrlToImage = null
          } else {
            _tmpUrlToImage = _stmt.getText(_columnIndexOfUrlToImage)
          }
          _item =
              Article(_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSource,_tmpTitle,_tmpUrl,_tmpUrlToImage)
          _result.add(_item)
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getArticle(articleId: String): Article? {
    val _sql: String = "SELECT * FROM articleTable WHERE articleId=?"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        var _argIndex: Int = 1
        _stmt.bindText(_argIndex, articleId)
        val _columnIndexOfAuthor: Int = getColumnIndexOrThrow(_stmt, "author")
        val _columnIndexOfContent: Int = getColumnIndexOrThrow(_stmt, "content")
        val _columnIndexOfDescription: Int = getColumnIndexOrThrow(_stmt, "description")
        val _columnIndexOfPublishedAt: Int = getColumnIndexOrThrow(_stmt, "articleId")
        val _columnIndexOfSource: Int = getColumnIndexOrThrow(_stmt, "source")
        val _columnIndexOfTitle: Int = getColumnIndexOrThrow(_stmt, "title")
        val _columnIndexOfUrl: Int = getColumnIndexOrThrow(_stmt, "url")
        val _columnIndexOfUrlToImage: Int = getColumnIndexOrThrow(_stmt, "urlToImage")
        val _result: Article?
        if (_stmt.step()) {
          val _tmpAuthor: String?
          if (_stmt.isNull(_columnIndexOfAuthor)) {
            _tmpAuthor = null
          } else {
            _tmpAuthor = _stmt.getText(_columnIndexOfAuthor)
          }
          val _tmpContent: String?
          if (_stmt.isNull(_columnIndexOfContent)) {
            _tmpContent = null
          } else {
            _tmpContent = _stmt.getText(_columnIndexOfContent)
          }
          val _tmpDescription: String?
          if (_stmt.isNull(_columnIndexOfDescription)) {
            _tmpDescription = null
          } else {
            _tmpDescription = _stmt.getText(_columnIndexOfDescription)
          }
          val _tmpPublishedAt: String
          _tmpPublishedAt = _stmt.getText(_columnIndexOfPublishedAt)
          val _tmpSource: Source
          val _tmp: String
          _tmp = _stmt.getText(_columnIndexOfSource)
          _tmpSource = __sourceTypeConverter.fromStringToSource(_tmp)
          val _tmpTitle: String
          _tmpTitle = _stmt.getText(_columnIndexOfTitle)
          val _tmpUrl: String
          _tmpUrl = _stmt.getText(_columnIndexOfUrl)
          val _tmpUrlToImage: String?
          if (_stmt.isNull(_columnIndexOfUrlToImage)) {
            _tmpUrlToImage = null
          } else {
            _tmpUrlToImage = _stmt.getText(_columnIndexOfUrlToImage)
          }
          _result =
              Article(_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSource,_tmpTitle,_tmpUrl,_tmpUrlToImage)
        } else {
          _result = null
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun deleteAllBookmark() {
    val _sql: String = "DELETE FROM articleTable"
    return performSuspending(__db, false, true) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        _stmt.step()
      } finally {
        _stmt.close()
      }
    }
  }

  public companion object {
    public fun getRequiredConverters(): List<KClass<*>> = emptyList()
  }
}
