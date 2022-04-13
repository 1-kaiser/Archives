#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#define g gotoxy

int main() {

	//reg
	char fname, lname;
	int age, pnum, reg;

	int c;

	//genre
	int select, load;

	//romance
	int r_c;
	//r1
	int r1_c, r1_quantity, r1_age, r1_total, r1_price=200, r1_p, r1_change;
	char r1_fname, r1_lname, r1_email, r1_bday;

    /*	//r2
	int r2_c, r2_quantity, r2_age, r2_total, r2_price=200, r2_p, r2_change;
	char r2_fname, r2_lname, r2_email, r2_bday;

	//r3
	int r3_c, r3_quantity, r3_age, r3_total, r3_price=200, r3_p, r3_change;
	char r3_fname, r3_lname, r3_email, r3_bday;

	//r4
	int r4_c, r4_quantity, r4_age, r4_total, r4_price=200, r4_p, r4_change;
	char r4_fname, r4_lname, r4_email, r4_bday;

	//r5
	int r5_c, r5_quantity, r5_age, r5_total, r5_price=200, r5_p, r5_change;
	char r5_fname, r5_lname, r5_email, r5_bday;

	//r6
	int r6_c, r6_quantity, r6_age, r6_total, r6_price=200, r6_p, r6_change;
	char r6_fname, r6_lname, r6_email, r6_bday;

	//r7
	int r7_c, r7_quantity, r7_age, r7_total, r7_price=200, r7_p, r7_change;
	char r7_fname, r7_lname, r7_email, r7_bday;

	//r8
	int r8_c, r8_quantity, r8_age, r8_total, r8_price=200, r8_p, r8_change;
	char r8_fname, r8_lname, r8_email, r8_bday;

	//r9
	int r9_c, r9_quantity, r9_age, r9_total, r9_price=200, r9_p, r9_change;
	char r9_fname, r9_lname, r9_email, r9_bday;

	//r10
	int r10_c, r10_quantity, r10_age, r10_total, r10_price=200, r10_p, r10_change;
	char r10_fname, r10_lname, r10_email, r10_bday;*/





	//border
	int reg_hor_up, reg_up2, reg_up3, reg_up4;


   /*	//border up
	for(reg_hor_up=1; reg_hor_up<=80; reg_hor_up++) {
	delay(25);
	printf("=");
	}
	//border right
	g(79,2); delay(25); printf("||"); g(79,3); delay(25); printf("||");
	g(79,4); delay(25); printf("||"); g(79,5); delay(25); printf("||");
	g(79,6); delay(25); printf("||"); g(79,7); delay(25); printf("||");
	g(79,8); delay(25); printf("||"); g(79,9); delay(25); printf("||");
	g(79,10); delay(25); printf("||"); g(79,11); delay(25); printf("||");
	g(79,12); delay(25); printf("||"); g(79,13); delay(25); printf("||");
	g(79,14); delay(25); printf("||"); g(79,15); delay(25); printf("||");
	g(79,16); delay(25); printf("||"); g(79,17); delay(25); printf("||");
	g(79,18); delay(25); printf("||"); g(79,19); delay(25); printf("||");
	g(79,20); delay(25); printf("||"); g(79,21); delay(25); printf("||");
	g(79,22); delay(25); printf("||"); g(79,23); delay(25); printf("||");
	//border down
	g(80,24); delay(25); printf("="); g(79,24); delay(25); printf("=");
	g(78,24); delay(25); printf("="); g(77,24); delay(25); printf("=");
	g(76,24); delay(25); printf("="); g(75,24); delay(25); printf("=");
	g(74,24); delay(25); printf("="); g(73,24); delay(25); printf("=");
	g(72,24); delay(25); printf("="); g(71,24); delay(25); printf("=");
	g(70,24); delay(25); printf("="); g(69,24); delay(25); printf("=");
	g(68,24); delay(25); printf("="); g(67,24); delay(25); printf("=");
	g(66,24); delay(25); printf("="); g(65,24); delay(25); printf("=");
	g(64,24); delay(25); printf("="); g(63,24); delay(25); printf("=");
	g(62,24); delay(25); printf("="); g(61,24); delay(25); printf("=");
	g(60,24); delay(25); printf("="); g(59,24); delay(25); printf("=");
	g(58,24); delay(25); printf("="); g(57,24); delay(25); printf("=");
	g(56,24); delay(25); printf("="); g(55,24); delay(25); printf("=");
	g(54,24); delay(25); printf("="); g(53,24); delay(25); printf("=");
	g(52,24); delay(25); printf("="); g(51,24); delay(25); printf("=");
	g(50,24); delay(25); printf("="); g(49,24); delay(25); printf("=");
	g(48,24); delay(25); printf("="); g(47,24); delay(25); printf("=");
	g(46,24); delay(25); printf("="); g(45,24); delay(25); printf("=");
	g(44,24); delay(25); printf("="); g(43,24); delay(25); printf("=");
	g(42,24); delay(25); printf("="); g(41,24); delay(25); printf("=");
	g(40,24); delay(25); printf("="); g(39,24); delay(25); printf("=");
	g(38,24); delay(25); printf("="); g(37,24); delay(25); printf("=");
	g(36,24); delay(25); printf("="); g(35,24); delay(25); printf("=");
	g(34,24); delay(25); printf("="); g(33,24); delay(25); printf("=");
	g(32,24); delay(25); printf("="); g(31,24); delay(25); printf("=");
	g(30,24); delay(25); printf("="); g(29,24); delay(25); printf("=");
	g(28,24); delay(25); printf("="); g(27,24); delay(25); printf("=");
	g(26,24); delay(25); printf("="); g(25,24); delay(25); printf("=");
	g(24,24); delay(25); printf("="); g(23,24); delay(25); printf("=");
	g(22,24); delay(25); printf("="); g(21,24); delay(25); printf("=");
	g(20,24); delay(25); printf("="); g(19,24); delay(25); printf("=");
	g(18,24); delay(25); printf("="); g(17,24); delay(25); printf("=");
	g(16,24); delay(25); printf("="); g(15,24); delay(25); printf("=");
	g(14,24); delay(25); printf("="); g(13,24); delay(25); printf("=");
	g(12,24); delay(25); printf("="); g(11,24); delay(25); printf("=");
	g(10,24); delay(25); printf("="); g(9,24); delay(25); printf("=");
	g(8,24); delay(25); printf("="); g(7,24); delay(25); printf("=");
	g(6,24); delay(25); printf("="); g(5,24); delay(25); printf("=");
	g(4,24); delay(25); printf("="); g(3,24); delay(25); printf("=");
	g(2,24); delay(25); printf("="); g(1,24); delay(25); printf("=");
	//border left
	g(1,23); delay(25); printf("||"); g(1,22); delay(25); printf("||");
	g(1,21); delay(25); printf("||"); g(1,20); delay(25); printf("||");
	g(1,19); delay(25); printf("||"); g(1,18); delay(25); printf("||");
	g(1,17); delay(25); printf("||"); g(1,16); delay(25); printf("||");
	g(1,15); delay(25); printf("||"); g(1,14); delay(25); printf("||");
	g(1,13); delay(25); printf("||"); g(1,12); delay(25); printf("||");
	g(1,11); delay(25); printf("||"); g(1,10); delay(25); printf("||");
	g(1,9); delay(25); printf("||"); g(1,8); delay(25); printf("||");
	g(1,7); delay(25); printf("||"); g(1,6); delay(25); printf("||");
	g(1,5); delay(25); printf("||"); g(1,4); delay(25); printf("||");
	g(1,3); delay(25); printf("||"); g(1,2); delay(25); printf("||");

	g(3,5);
	for(reg_up2=1; reg_up2<=76; reg_up2++) {
	delay(25);
	printf("=");
	}

	g(3,7);
	for(reg_up3=1; reg_up3<=76; reg_up3++) {
	delay(25);
	printf("=");
	}
	//middle vertical line
	g(37,8); delay(25); printf("||"); g(37,9); delay(25); printf("||");
	g(37,10); delay(25); printf("||"); g(37,11); delay(25); printf("||");
	g(37,12); delay(25); printf("||"); g(37,13); delay(25); printf("||");
	g(37,14); delay(25); printf("||"); g(37,15); delay(25); printf("||");
	g(37,16); delay(25); printf("||"); g(37,17); delay(25); printf("||");
	g(37,18); delay(25); printf("||"); g(37,19); delay(25); printf("||");

	g(3,20);
	for(reg_up4=1; reg_up4<=76; reg_up4++) {
	delay(25);
	printf("=");
	}
	g(3,21); printf("==="); g(3,22); printf("==="); g(3,23); printf("===");
	g(76,21); printf("==="); g(76,22); printf("==="); g(76,23); printf("===");
	*/
	clrscr();
	do {
	g(29,3);
	printf("WELCOME TO BOOKTRONIC");
	g(3,6);
	printf("-*-*-*-*-*-*-*-*-*-*-*-*-*-*- REGISTRATION -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",age);
	g(13,12);
	printf("Phone Number: ");
	g(55,12);
	scanf("%d",pnum);
	g(17,21);
	printf("Is your information correct?(1=Yes/2=No)");
	g(29,22);
	printf("Your choice: ");
	scanf("%d",&reg);

	switch(reg) {


	case 1:
	g(25,23);
	printf("Directing to Genre Menu......");
	getch();
	clrscr();
	continue;


	case 2:
	g(29,23);
	printf("Register again.");
	getch();
	clrscr();
	break;


	default:
	getch();
	g(23,23);
	printf("Invalid choice.(1=Yes/2=No)");
	getch();
	clrscr();
	}
	} while(reg>2 || reg==2);




	for(load=0; load<=5000; load++) {
	g(29,23);
	printf("Processing: %d",load/50);
	}

	clrscr();

	//border up
	printf("================================================================================");
	//border left
	g(1,2);
	printf("||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||");
	//border right
	g(79,2); printf("||"); g(79,3); printf("||");
	g(79,4); printf("||"); g(79,5); printf("||");
	g(79,6); printf("||"); g(79,7); printf("||");
	g(79,8); printf("||"); g(79,9); printf("||");
	g(79,10); printf("||"); g(79,11); printf("||");
	g(79,12); printf("||"); g(79,13); printf("||");
	g(79,14); printf("||"); g(79,15); printf("||");
	g(79,16); printf("||"); g(79,17); printf("||");
	g(79,18); printf("||"); g(79,19); printf("||");
	g(79,20); printf("||"); g(79,21); printf("||");
	g(79,22); printf("||"); g(79,23); printf("||");
	g(79,24); printf("||");
	//border down
	g(1,24);
	printf("================================================================================");
	g(3,5);
	printf("============================================================================");
	g(3,7);
	printf("============================================================================");
	g(3,20);
	printf("============================================================================");
	g(3,21); printf("==="); g(3,22); printf("==="); g(3,23); printf("===");
	g(76,21); printf("==="); g(76,22); printf("==="); g(76,23); printf("===");

	g(35,3);
	printf("GENRE MENU");
	g(30,6);
	printf("Select Genre You Want");
	g(33,10);
	printf("[1] Romance");
	g(33,11);
	printf("[2] Mystery");
	g(33,12);
	printf("[3] Horror");
	g(33,13);
	printf("[4] Short Stories");
	g(33,14);
	printf("[5] Poetry");
	g(33,15);
	printf("[6] Exit");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&select);

	switch(select) {


		case 1:
	clrscr();
	romance: do{
	//border up
	printf("================================================================================");
	//border left
	g(1,2);
	printf("||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||");
	//border right
	g(79,2); printf("||"); g(79,3); printf("||");
	g(79,4); printf("||"); g(79,5); printf("||");
	g(79,6); printf("||"); g(79,7); printf("||");
	g(79,8); printf("||"); g(79,9); printf("||");
	g(79,10); printf("||"); g(79,11); printf("||");
	g(79,12); printf("||"); g(79,13); printf("||");
	g(79,14); printf("||"); g(79,15); printf("||");
	g(79,16); printf("||"); g(79,17); printf("||");
	g(79,18); printf("||"); g(79,19); printf("||");
	g(79,20); printf("||"); g(79,21); printf("||");
	g(79,22); printf("||"); g(79,23); printf("||");
	g(79,24); printf("||");
	//border down
	g(1,24);
	printf("================================================================================");
	g(3,5);
	printf("============================================================================");
	g(3,7);
	printf("============================================================================");
	g(3,20);
	printf("============================================================================");
	g(3,21); printf("==="); g(3,22); printf("==="); g(3,23); printf("===");
	g(76,21); printf("==="); g(76,22); printf("==="); g(76,23); printf("===");

	g(34,3);

	printf("ROMANCE GENRE");
	g(30,6);
	printf("Select Ebook You Want");
	g(11,10);
	printf("[1] He's Into Her");
	g(11,11);
	printf("[2] Ang Boyfriend Kong Artista");
	g(11,12);
	printf("[3] His Slave");
	g(11,13);
	printf("[4] Players Academy");
	g(11,14);
	printf("[5] The Mistletoe Motive");
	g(44,10);
	printf("[6] The Love Hypothesis");
	g(44,11);
	printf("[7] Take It or Leave It");
	g(44,12);
	printf("[8] Love Without Limits");
	g(44,13);
	printf("[9] 101 Days of Heartbreak");
	g(44,14);
	printf("[10] Just the Benefits");
	g(34,18);
	printf("[11] Back");
	g(29,22);
	printf("Your choice: ");
	scanf("%d",&r_c);

	switch(r_c) {

	case 1:
	clrscr();
	//border up
	printf("================================================================================");
	//border left
	g(1,2);
	printf("||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||");
	//border right
	g(79,2); printf("||"); g(79,3); printf("||");
	g(79,4); printf("||"); g(79,5); printf("||");
	g(79,6); printf("||"); g(79,7); printf("||");
	g(79,8); printf("||"); g(79,9); printf("||");
	g(79,10); printf("||"); g(79,11); printf("||");
	g(79,12); printf("||"); g(79,13); printf("||");
	g(79,14); printf("||"); g(79,15); printf("||");
	g(79,16); printf("||"); g(79,17); printf("||");
	g(79,18); printf("||"); g(79,19); printf("||");
	g(79,20); printf("||"); g(79,21); printf("||");
	g(79,22); printf("||"); g(79,23); printf("||");
	g(79,24); printf("||");
	//border down
	g(1,24);
	printf("================================================================================");
	g(3,5);
	printf("============================================================================");
	g(3,20);
	printf("============================================================================");
	g(3,21); printf("==="); g(3,22); printf("==="); g(3,23); printf("===");
	g(76,21); printf("==="); g(76,22); printf("==="); g(76,23); printf("===");
	g(33,3);
	printf("He's Into Her");

	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("She's transferred into the Benison International School where she stands");
	g(5,10);
	delay(700);
	printf("up againts Deib Lohr Enrile, the school varsity captain. The two start");
	g(5,11);
	delay(700);
	printf("as sworn enemies and even as their relationship grows, they do their");
	g(5,12);
	delay(700);
	printf("to outwit each other.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(12,16);
	delay(700);
	printf("I am the bully and she's my target, that's how we met.");
	g(30,18);
	printf("Ebook Price: 200");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&r1_c);

	switch(r1_c) {

	case 1:
	clrscr();
	//border up
	printf("================================================================================");
	//border left
	g(1,2);
	printf("||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||");
	//border right
	g(79,2); printf("||"); g(79,3); printf("||");
	g(79,4); printf("||"); g(79,5); printf("||");
	g(79,6); printf("||"); g(79,7); printf("||");
	g(79,8); printf("||"); g(79,9); printf("||");
	g(79,10); printf("||"); g(79,11); printf("||");
	g(79,12); printf("||"); g(79,13); printf("||");
	g(79,14); printf("||"); g(79,15); printf("||");
	g(79,16); printf("||"); g(79,17); printf("||");
	g(79,18); printf("||"); g(79,19); printf("||");
	g(79,20); printf("||"); g(79,21); printf("||");
	g(79,22); printf("||"); g(79,23); printf("||");
	g(79,24); printf("||");
	//border down
	g(1,24);
	printf("================================================================================");
	g(3,5);
	printf("============================================================================");
	g(3,7);
	printf("============================================================================");
	g(3,20);
	printf("============================================================================");
	g(3,21); printf("==="); g(3,22); printf("==="); g(3,23); printf("===");
	g(76,21); printf("==="); g(76,22); printf("==="); g(76,23); printf("===");
	//middle line
	g(37,8); delay(25); printf("||"); g(37,9); delay(25); printf("||");
	g(37,10); delay(25); printf("||"); g(37,11); delay(25); printf("||");
	g(37,12); delay(25); printf("||"); g(37,13); delay(25); printf("||");
	g(37,14); delay(25); printf("||"); g(37,15); delay(25); printf("||");
	g(37,16); delay(25); printf("||"); g(37,17); delay(25); printf("||");
	g(37,18); delay(25); printf("||"); g(37,19); delay(25); printf("||");

	g(31,3);
	printf("He's Into Her");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r1_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r1_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r1_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r1_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r1_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r1_quantity);
	r1_total = r1_quantity*r1_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r1_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r1_p);

	if(r1_p>=200) {

	r1_change = r1_p - r1_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r1_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	//border up
	printf("================================================================================");
	//border left
	g(1,2);
	printf("||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||\n||");
	//border right
	g(79,2); printf("||"); g(79,3); printf("||");
	g(79,4); printf("||"); g(79,5); printf("||");
	g(79,6); printf("||"); g(79,7); printf("||");
	g(79,8); printf("||"); g(79,9); printf("||");
	g(79,10); printf("||"); g(79,11); printf("||");
	g(79,12); printf("||"); g(79,13); printf("||");
	g(79,14); printf("||"); g(79,15); printf("||");
	g(79,16); printf("||"); g(79,17); printf("||");
	g(79,18); printf("||"); g(79,19); printf("||");
	g(79,20); printf("||"); g(79,21); printf("||");
	g(79,22); printf("||"); g(79,23); printf("||");
	g(79,24); printf("||");
	//border down
	g(1,24);
	printf("================================================================================");
	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();


	} else if(r1_p<200){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	case 2:
	getch();
	clrscr();
	}
	}



	return 0;

} while(select);
}

return 0;
}