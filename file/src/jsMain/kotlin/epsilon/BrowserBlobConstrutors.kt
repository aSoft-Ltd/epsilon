@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package epsilon

import org.w3c.files.Blob as BBlob

inline fun blobOf(blob: BBlob): Blob = BrowserBlob(blob)

inline fun blobOfOrNull(blob: BBlob?): Blob? = blob?.let { blobOf(it) }