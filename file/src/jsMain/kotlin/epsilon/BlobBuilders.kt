@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package epsilon

import epsilon.internal.FileBlobImpl
import org.w3c.dom.asList
import org.w3c.files.File
import org.w3c.files.FileList
import org.w3c.files.Blob as BBlob

inline fun fileBlobsFrom(list: FileList? = null): Array<FileBlob> = list?.asList()?.map { fileBlobOf(it) }?.toTypedArray() ?: arrayOf()

inline fun fileBlobOf(file: File): FileBlob = FileBlobImpl(file)

inline fun fileBlobOfOrNull(file: File? = null): FileBlob? = file?.let { fileBlobOf(it) }

inline fun blobOf(blob: BBlob): Blob = BrowserBlob(blob)

inline fun blobOfOrNull(blob: BBlob?): Blob? = blob?.let { blobOf(it) }