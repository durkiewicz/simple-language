package simple.language.psi.impl;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import org.jetbrains.annotations.Nullable;
import simple.language.SimpleFileType;
import simple.language.psi.SimpleFile;

public class SimpleElementFactory {
    @Nullable
    public static PsiElement createIdentifier(Project project, String text) {
        final SimpleFile file = createFile(project, String.format("%s=1", text));
        return file.getFirstChild().getFirstChild();
    }

    private static SimpleFile createFile(Project project, String text) {
        String name = "dummy.simple";
        return (SimpleFile) PsiFileFactory.getInstance(project)
                .createFileFromText(name, SimpleFileType.INSTANCE, text);
    }
}
