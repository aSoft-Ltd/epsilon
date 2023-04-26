@file:JsExport

package epsilon

import epsilon.serializers.FileBlobSerializer
import kollections.JsExport
import kotlinx.serialization.Serializable

@Serializable(with = FileBlobSerializer::class)
interface FileBlob : Blob {
    val path: String
    val name: String
}