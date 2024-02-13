@file:JsExport

package epsilon

import kotlinx.JsExport

interface FileBlob : Blob {
    val path: String
    val name: String
}