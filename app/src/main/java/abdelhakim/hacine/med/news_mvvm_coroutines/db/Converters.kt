package abdelhakim.hacine.med.news_mvvm_coroutines.db

import abdelhakim.hacine.med.news_mvvm_coroutines.models.Source
import androidx.room.TypeConverter

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}