@file:JsExport

package epsilon

import epsilon.serializers.FileBlobSerializer
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@Serializable(with = FileBlobSerializer::class)
interface FileBlob : Blob {
    val path: String
    val name: String
}