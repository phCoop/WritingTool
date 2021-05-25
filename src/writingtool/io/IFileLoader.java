package writingtool.io;

import writingtool.io.filetypes.SpecializedFile;

/**
 * @author Philip Cooper
 *
 * This interface specifies a set of methods for loading data files. These
 * files must be of type SpecializedFile to be loaded with this class.
 */
public interface IFileLoader {
    // File management:
    void open(SpecializedFile file);
    void close(SpecializedFile file);

    // Field-based file loading:
    < T,S > T loadLabeledField(S label);
    < T > T getNextField();

    < T > T loadIntoObject(T object);
}
