import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Generator {
    static BufferedWriter bw;
    static List<String> dirs = new ArrayList<>();
    static List<String> files = new ArrayList<>();

    public static void lists(File[] list){
        for ( File f : list ) {
            if (f.getName().endsWith(".html")) f.delete();
            if(f.isDirectory())
            {
                dirs.add(f.getName());
                System.out.println(f.getName());
            }
            else if (f.getName().toLowerCase().endsWith(".jpg") || f.getName().toLowerCase().endsWith(".jpeg") || f.getName().toLowerCase().endsWith(".png")) {
                files.add(f.getName());
            }
        }
    }
    public static void index(String path, int depth, String vissza) {
        try {
            bw = new BufferedWriter(new FileWriter(path + "\\/index.html"));
            String d = "";
            for (int i = 0; i < depth; i++) {
                d += "../";
            }
            bw.write("<html>\r\n"
                    + "<head>\r\n"
                    + "</head>\r\n"
                    + "    <body>\r\n"
                    + "        <h1><a href=\"" + d + "index.html\">Start Page</a></h1>\r\n"
                    + "        <hr size=\"2px\" color = \"black\"/>\r\n"
                    + "        <h2>Directories:</h2>\r\n");
            if (!Objects.equals(vissza, "")) {
                bw.write("\t\t<p>&emsp;&#x2022;<a href=\"" + vissza + "index.html\"> <<<a/><p/>\r\n");
            }
            for (String dir : dirs)
                bw.write("<p>&emsp;&#x2022;  <a href=\"" + dir + "\\index.html\">" + dir + "<a/></p>\r\n");
            bw.write("<hr size=\"2px\" color = \"black\"/>\r\n<h3>Images:</h3>\r\n");
            for (String fi : files)
                bw.write("<p>&emsp;&#x2022;  <a href=\"" + fi.substring(0, fi.lastIndexOf(".")) + ".html\">" + fi + "<a/></p>\r\n");
            bw.write("\r\n</body>\r\n</html>");

            bw.close();
            dirs.clear();
            files.clear();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void pics(File[] list, File f, int depth){
        if(files.size() == 0) {
            for (File fi : list) {
                if (fi.isDirectory()) dirs.add(fi.getName());
                else if (fi.getName().toLowerCase().endsWith(".jpg") || fi.getName().toLowerCase().endsWith(".jpeg") || fi.getName().toLowerCase().endsWith(".png")) {
                    files.add(fi.getName());
                }
            }
        }
        try {
            bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile().toString().substring(0, f.getAbsoluteFile().toString().lastIndexOf("."))+".html"));
            String d = "";
            for (int i = 0; i < depth; i++) {
                d+="../";
            }
            String elozo = "";
            String jelenlegi = "";
            String kovetkezo = "";

            if(files.size()!=0) {
                jelenlegi = files.get(0).substring(0,files.get(0).lastIndexOf("."));
                for (int i = 0; i < files.size(); i++) {
                    jelenlegi = files.get(i).substring(0,files.get(i).lastIndexOf("."));
                    if (f.getName().equals(files.get(i))) {
                        if(i == 0)
                        {
                            if(files.size() == 1){
                                elozo = jelenlegi;
                                kovetkezo = jelenlegi;
                                break;
                            }
                            elozo = jelenlegi;
                            kovetkezo = files.get(i + 1).substring(0,files.get(i + 1).lastIndexOf("."));
                            break;
                        }
                        if(i == files.size()-1)
                        {
                            kovetkezo = jelenlegi;
                            elozo = files.get(i - 1).substring(0,files.get(i - 1).lastIndexOf("."));
                            break;
                        }
                        kovetkezo = files.get(i + 1).substring(0,files.get(i + 1).lastIndexOf("."));
                        elozo = files.get(i-1).substring(0,files.get(i-1).lastIndexOf("."));
                        break;
                    }
                }
            }
            bw.write("<html>\n\t<body><h1><a href=\""+ d +"index.html\">Start Page</a></h1>\r\n"
                    + "        <hr size=\"2px\" color = \"black\"/>\r\n"
                    + "        <h3><a href = \"index.html\">^^<a/></h3>\r\n"
                    + "         <h3><a href = \""+ elozo +".html\"><<  <a/>" + f.getName() + "<a href = \""+ kovetkezo +".html\">  >> <a/></h3> \r\n"
                    + "         <h3><a href = \""+kovetkezo+".html\"> <img src=" + f.getName() + " width=\"500\" /><a/> </h3>\r\n\t</body>\n\r</html>");
            bw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        dirs.clear();
        files.clear();

    }
}
