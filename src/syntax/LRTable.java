package syntax;

import groovyjarjarantlr4.v4.runtime.misc.Nullable;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import util.JSONTableGenerator;

import java.io.*;
import java.text.ParseException;

/*
The LRTable class initially needs to init once for file IO.
Reads the transitions of items defined in the LRTable.json file.
s[num] : shift and goto state # num
r[num] : reduce by production # num
[num] : goto state # num
acc : accept
epsilon treats it as 'e', and rejects if there is no transition corresponding to the input in json.
 */

public class LRTable {

    public static final String FILE_NAME = "." + File.separator + "table" + File.separator + "LRTable.json";

    public static JSONObject jsonTable;

    public static void init() throws FileNotFoundException {
       // json file
        JSONTableGenerator jsonTableGenerator = new JSONTableGenerator(FILE_NAME);

        jsonTable = jsonTableGenerator.getJSONTable();
    }



}