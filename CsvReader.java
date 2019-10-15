package Com.WebService.ServiceRest;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "csvreader" path)
 */
@Path("csvreader")
public class CsvReader {

    /**
     *@return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public void main (String args[]) throws IOException {
    	List<List<String>> records = new ArrayList<>();
    	try (Scanner scanner = new Scanner(new File("Popular_Baby_Names.csv"));) {
    	    while (scanner.hasNextLine()) {
    	        records.add(getRecordFromLine(scanner.nextLine()));
    	    }
    	}
    	}
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    	}}
    
    
    