package com.vgb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataConverter {
	
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
						c = new Company(uuid, contactUUID, name, street, city, state, zipcode);
						
						result.add(c);
					}
				}
			} catch (Exception e) {
				throw new RuntimeException("Encountered Error on line " + line, e);
			}

			return result;
		}
	}
	
	public class DataLoaderItems {
		
		public static final String FILE_PATH = "data/Items.csv";
		public static List<Item> loadItems() {

			List<Item> result = new ArrayList<Item>();
			
			String line = null;

			try (Scanner s = new Scanner(new File(FILE_PATH))) {

				int numRecords = Integer.parseInt(s.nextLine());
				for (int i = 0; i < numRecords; i++) {

					line = s.nextLine();
					if (!line.trim().isEmpty()) {
						Item e = null;
						String tokens[] = line.split(",");
						String uuid = tokens[0];
						String type = tokens[1];
						String name = tokens[2];
						String modelNumber = null;
						double cost = 0;
						String unit = null;
						double costPerUnit = 0;
						String companyUUID = null;
						
						if (tokens[2].equals("E")) {
							modelNumber = tokens[3];
							cost = Double.parseDouble(tokens[4]);
						} else if (tokens[2].equals("M")) {
							unit = tokens[3];
							costPerUnit = Double.parseDouble(tokens[5]);
						} else if (tokens[2].equals("C")) {
							companyUUID = tokens[3];
							
						}

						if (tokens[2].equals("E")) {
							e = new Equipment(uuid, type, name, modelNumber, cost);
						} else if (tokens[2].equals("E")) {
							// TODO: modify this to create a Staff employee
							e = new Material(uuid, type, name, unit, costPerUnit);
						} else if (tokens[2].equals("E")) {
							// TODO: modify this to create a Temporary employee
							e = new Contract(uuid, type, name, companyUUID);
						}

						result.add(e);
					}
				}
			} catch (Exception e) {
				throw new RuntimeException("Encountered Error on line " + line, e);
			}

			return result;
		}
	}
	
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
						List<String> list = new ArrayList<String>();
						int j = 3;
						while(tokens[j] != null) {
							String email = tokens[j];
							list.add(email);
							
						}
						
						p = new Persons(uuid, firstName, lastName, list);

						result.add(p);
					}
				}
			} catch (Exception e) {
				throw new RuntimeException("Encountered Error on line " + line, e);
			}

			return result;
		}
	}
	
	
	public static void main(String args[]) {
		
		
		
		
		
	}
	
}