@file:JsExport

package epsilon

import kotlin.js.JsExport

interface FileBlob : Blob {
    val path: String
    val name: String
}