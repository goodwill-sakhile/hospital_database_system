#include "hospital_information_gather.h"
#include <iostream>
#include <string>
void writeColumnsNames{
	ofstream file_object;
	file_object.open("nurse_info.txt");
	file_object << "Id;Name;Surname;Wards";
}
void registerNurse(string id, string name, string surname, string wards){
	string line;
	line = id+";"+name+";"+surname+";"+wards;
	ofstream file_object;
	file_object.open("nurse_info.txt", ios:app);
	file_object << line;
	file_object.close();
}