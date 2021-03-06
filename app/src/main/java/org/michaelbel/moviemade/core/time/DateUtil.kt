package org.michaelbel.moviemade.core.time

import java.text.SimpleDateFormat
import java.util.*
import java.util.Locale.ENGLISH

object DateUtil {

    fun formatRuntime(runtime: Int): String {
        val formatMin = SimpleDateFormat("mm", ENGLISH)
        val formatHour = SimpleDateFormat("H:mm", ENGLISH)

        val date = formatMin.parse(runtime.toString())
        return formatHour.format(date as Date)
    }

    fun formatReleaseDate(releaseDate: String): String {
        val oldFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val newFormat = SimpleDateFormat("d MMM yyyy", ENGLISH)

        val date = oldFormat.parse(releaseDate)
        return newFormat.format(date as Date)
    }

    fun formatSystemTime(time: Long): String {
        val simpleDateFormat = SimpleDateFormat("d MMM yyyy", ENGLISH)
        val date = Date(time)

        return simpleDateFormat.format(date)
    }
}