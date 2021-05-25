package writingtool.io.filetypes;

import java.io.File;
import java.util.List;

/**
 * @author Philip Cooper
 *
 * This class specifies methods to allow file loaders and writers to
 * determine the format and fields to use when loading and storing a file.
 * It also allows the file system manager to select which fields of the file
 * type to use. Classes implementing this interface can also determine which
 * fields are turned on by default.
 */
public abstract class SpecializedFile extends File {

    public SpecializedFile(String pathname) {
        super(pathname);
    }

    // Handle special file categories:
    public abstract boolean isImageFile();
    public abstract boolean isTextFile();

    // Field configuration:
    public abstract < T > void turnOnField(T label);
    public abstract < T > void turnOffField(T label);
    public abstract < T > boolean isFieldOn(T label);

    // Field retrieval:
    public abstract < T > List<T> getActiveFields();

    // Format retrieval:
    public abstract boolean areLabelsWritten();
    public abstract boolean hasFieldDelimiter();
    public abstract boolean hasLabelDelimiter();

    public abstract char getFieldDelimiter();
    public abstract char getLabelDelimiter();
}
