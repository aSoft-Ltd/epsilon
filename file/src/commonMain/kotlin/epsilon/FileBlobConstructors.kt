@file:JvmName("FileBlobConstructorsCommon")
package epsilon

import kotlin.jvm.JvmName

expect inline fun FileBlob(path: String): FileBlob

inline fun FileBlobOrNull(path: String? = null): FileBlob? = try {
    FileBlob(path = path!!)
} catch (_: Throwable) {
    null
}