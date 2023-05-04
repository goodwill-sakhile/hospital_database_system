#include "hospital_information_gather.h"
#include <iostream>
#include <string>
void writeColumnsNames{
	ofstream file_object;
	file_object.open("patients_info.txt");
	file_object << "Id;Name;Surname;Wards";
}
void registerPatient(string id, string name, string surname, string wards){
	//function to call when registering patients
	string line;
	line = id+";"+name+";"+surname+";"+wards;
	ofstream file_object;
	file_object.open("patients_info.txt", ios:app);