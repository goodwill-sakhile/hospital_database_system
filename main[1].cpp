#include <iostream>
#include <sstream>
#include <string>
using namespace std;
void displaySystemOptions(){
	cout << "Hospital system functions: "<< endl;
	cout << "(1) Register some data " << endl;
	cout << "(2) Update some data "<< endl;
	cout << "(3) Delete some data " << endl;
}
int takeIntegerInput(){
	string str_integer;
	int inputed_integer;
	cin >> str_integer;
	stringstream(str_integer) >> inputed_integer;
	return inputed_integer;
}
void displayDataRegisteringOptions(){
	cout << "Registering Screen: " << endl;
        cout << "(1) Register new Docter" << end
l;
        cout << "(2) Register new Nurse" << endl;
        cout << "(2) Register new Patient" << endl;                                             }
void displayDataUpdatingOptions(){
	cout << "Update Screen: " << endl;
	cout << "(1) Update Docter details " endl;
	cout << "(2) Update Nurse details" << endl;
	cout << "(3) Update Patients details" << endl;.
void decideOnTheInteger(int option_integer){
	if (option_integer == 1){
		displayDataRegisteringOption();
	}
	else if (option_integer == 2){
		displayDataUpdatingOptions();
	}
	else if (option_integer == 3){
		displayDataDeletionOptions();
	}
	else {
		displayDataOptions();
		takeIntegerInput();
	}
}
int main(){
	displaySystemOptions();
	int option = takeIntegerInput();
	cout << "The option is: " << option << endl;
	return 0;
}
