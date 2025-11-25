@file:OptIn(InternalResourceApi::class)

package news_kmp_app.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/news_kmp_app.composeapp.generated.resources/"

internal val Res.drawable.compose_multiplatform: DrawableResource by lazy {
      DrawableResource("drawable:compose_multiplatform", setOf(
        ResourceItem(setOf(), "${MD}drawable/compose-multiplatform.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_bookmark_filled: DrawableResource by lazy {
      DrawableResource("drawable:ic_bookmark_filled", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_bookmark_filled.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_bookmark_outlined: DrawableResource by lazy {
      DrawableResource("drawable:ic_bookmark_outlined", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_bookmark_outlined.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_browse: DrawableResource by lazy {
      DrawableResource("drawable:ic_browse", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_browse.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_delete: DrawableResource by lazy {
      DrawableResource("drawable:ic_delete", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_delete.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_headline: DrawableResource by lazy {
      DrawableResource("drawable:ic_headline", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_headline.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_light_mode: DrawableResource by lazy {
      DrawableResource("drawable:ic_light_mode", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_light_mode.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_network_error: DrawableResource by lazy {
      DrawableResource("drawable:ic_network_error", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_network_error.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_retry: DrawableResource by lazy {
      DrawableResource("drawable:ic_retry", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_retry.xml", -1, -1),
      ))
    }

internal val Res.drawable.ic_search: DrawableResource by lazy {
      DrawableResource("drawable:ic_search", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_search.xml", -1, -1),
      ))
    }

internal val Res.drawable.logo: DrawableResource by lazy {
      DrawableResource("drawable:logo", setOf(
        ResourceItem(setOf(), "${MD}drawable/logo.png", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("compose_multiplatform", Res.drawable.compose_multiplatform)
  map.put("ic_bookmark_filled", Res.drawable.ic_bookmark_filled)
  map.put("ic_bookmark_outlined", Res.drawable.ic_bookmark_outlined)
  map.put("ic_browse", Res.drawable.ic_browse)
  map.put("ic_delete", Res.drawable.ic_delete)
  map.put("ic_headline", Res.drawable.ic_headline)
  map.put("ic_light_mode", Res.drawable.ic_light_mode)
  map.put("ic_network_error", Res.drawable.ic_network_error)
  map.put("ic_retry", Res.drawable.ic_retry)
  map.put("ic_search", Res.drawable.ic_search)
  map.put("logo", Res.drawable.logo)
}
