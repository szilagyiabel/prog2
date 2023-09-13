import java.io.BufferedWriter;
import java.io.File;

public class Bejar {

    int depth = 0;
    String vissza = "";

    public void walk( String path) {
        File root = new File( path );
        File[] list = root.listFiles();

        BufferedWriter bw;

        if (list == null) return;

        Generator.lists(list);

        Generator.index(path, depth, vissza);
        vissza = "";

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                depth++;
                vissza = "../";
                walk(f.getAbsolutePath());
            }
            else if (f.getName().toLowerCase().endsWith(".jpg") ||
                    f.getName().toLowerCase().endsWith(".jpeg") ||
                    f.getName().toLowerCase().endsWith(".png")) {Generator.pics(list, f, depth);}
        }
        depth--;
    }
}