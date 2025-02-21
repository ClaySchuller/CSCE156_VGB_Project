package unl.soc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoaderCompanies {

	public static final String FILE_PATH = "data/Companies.csv";

	public static List<Company> loadCompanies() {

		List<Company> result = new ArrayList<Company>();
		
		String line = null;

		try (Scanner s = new Scanner(new File(FILE_PATH))) {

			int numRecords = Integer.parseInt(s.nextLine());
			for (int i = 0; i < numRecords; i++) {

				line = s.nextLine();
				if (!line.trim().isEmpty()) {
					Company c = null;
					String tokens[] = line.split(",");
					String uuid = tokens[0];
					String contactUUID = tokens[1];
					String name = tokens[2];
					String street = tokens[3];
					String city = tokens[4];
					String state = tokens[5];
					String zipcode = tokens[6];
					
					Address a = new Address(street, city, state, zipcode);
					
					c = new Company(uuid, contactUUID, name, a);

					result.add(c);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Encountered Error on line " + line, e);
		}

		return result;
	}
}
