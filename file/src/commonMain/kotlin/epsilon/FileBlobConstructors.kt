package epsilon

import kase.Failure
import kase.Result
import kase.Success
import kotlin.jvm.JvmName

expect inline fun FileBlob(path: String): FileBlob

inline fun FileBlobOrNull(path: String? = null): FileBlob? = try {
    FileBlob(path = path!!)
} catch (_: Throwable) {
    null
}

inline fun FileBlobOrResult(path: String? = null): Result<FileBlob> {
    if (path == null) return Failure(IllegalArgumentException("Can't obtain a file with a null path param"))
    return try {
        Success(FileBlob(path))
    } catch (err: Throwable) {
        Failure(err)
    }
}