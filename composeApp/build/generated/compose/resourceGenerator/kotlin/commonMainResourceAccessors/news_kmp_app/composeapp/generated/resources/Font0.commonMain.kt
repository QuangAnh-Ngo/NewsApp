@file:OptIn(InternalResourceApi::class)

package news_kmp_app.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.FontResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/news_kmp_app.composeapp.generated.resources/"

internal val Res.font.open_sans: FontResource by lazy {
      FontResource("font:open_sans", setOf(
        ResourceItem(setOf(), "${MD}font/open_sans.ttf", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainFont0Resources(map: MutableMap<String, FontResource>) {
  map.put("open_sans", Res.font.open_sans)
}
