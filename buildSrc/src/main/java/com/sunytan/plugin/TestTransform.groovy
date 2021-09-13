import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform

class TestTransform extends Transform{
    @Override
    String getName() {
        return "TestTransform"
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return null
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return null
    }

    @Override
    boolean isIncremental() {
        return false
    }
}