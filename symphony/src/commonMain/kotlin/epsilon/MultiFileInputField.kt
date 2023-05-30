@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package epsilon

import epsilon.FileBlob
import kollections.List
import symphony.properties.Clearable
import symphony.properties.Hintable
import symphony.properties.Labeled
import symphony.properties.Mutability
import symphony.properties.Requireble
import symphony.properties.Settable
import symphony.validation.Validateable
import symphony.SerializableLiveDataList
import kotlin.js.JsExport

interface MultiFileInputField : Labeled, Hintable, Mutability, Requireble, SerializableLiveDataList<FileBlob>, Settable<List<FileBlob>>, Validateable<List<FileBlob>>, Clearable {
    fun add(file: FileBlob)
    fun addAll(files: List<FileBlob>)
    fun remove(file: FileBlob)
    fun removeAll(files: List<FileBlob> = data.value.output)
}