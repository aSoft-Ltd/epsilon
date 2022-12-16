@file:JsExport

package epsilon

import kotlin.js.JsExport

interface FileBlob : Blob {
    val name: String
}