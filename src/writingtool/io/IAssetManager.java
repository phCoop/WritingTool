package writingtool.io;

/**
 * @author Philip Cooper
 *
 * This interface specifies the methods necessary to load assets with in-program
 * asset names from the actual assets in the file system.
 */
public interface IAssetManager {
    public < T > T loadAsset(String name);
}
