package unl.soc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoaderPersons {

	public static final String FILE_PATH = "data/Persons.csv";

	public static List<Persons> loadPersons() {

		List<Persons> result = new ArrayList<Persons>();
		
		String line = null;

		try (Scanner s = new Scanner(new File(FILE_PATH))) {

			int numRecords = Integer.parseInt(s.nextLine());
			for (int i = 0; i < numRecords; i++) {

				line = s.nextLine();
				if (!line.trim().isEmpty()) {
					Persons p = null;
					String tokens[] = line.split(",");
					String uuid = tokens[0];
					String firstName = tokens[1];
					String lastName = tokens[2];
					Person person = new Person(firstName, lastName);
					List<String> list = new ArrayList<String>();
					int j = 3;
					while(tokens[j] != null) {
						String email = tokens[j];
						list.add(email);
						
					}
					
					p = new Persons(uuid, person, list);

					result.add(p);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Encountered Error on line " + line, e);
		}

		return result;
	}
}
