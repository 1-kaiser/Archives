#include<stdio.h>
#define g gotoxy

int main() {

	//registration
	char fname[25], lname[25];
	int reg, age, pnum;
	int choice;
	int r_c, rchoice, m_c, mchoice, h_c, hchoice, ss_c, sschoice, p_c, pchoice;
	//romance
	//r1
	int r1_quantity, r1_age, r1_total, r1_price=200, r1_p, r1_change;
	char r1_fname, r1_lname, r1_email, r1_bday;
	//r2
	int r2_quantity, r2_age, r2_total, r2_price=150, r2_p, r2_change;
	char r2_fname, r2_lname, r2_email, r2_bday;
	//r3
	int r3_quantity, r3_age, r3_total, r3_price=200, r3_p, r3_change;
	char r3_fname, r3_lname, r3_email, r3_bday;
	//r4
	int r4_quantity, r4_age, r4_total, r4_price=170, r4_p, r4_change;
	char r4_fname, r4_lname, r4_email, r4_bday;
	//r5
	int r5_quantity, r5_age, r5_total, r5_price=130, r5_p, r5_change;
	char r5_fname, r5_lname, r5_email, r5_bday;
	//r6
	int r6_quantity, r6_age, r6_total, r6_price=220, r6_p, r6_change;
	char r6_fname, r6_lname, r6_email, r6_bday;
	//r7
	int r7_quantity, r7_age, r7_total, r7_price=250, r7_p, r7_change;
	char r7_fname, r7_lname, r7_email, r7_bday;
	//r8
	int r8_quantity, r8_age, r8_total, r8_price=200, r8_p, r8_change;
	char r8_fname, r8_lname, r8_email, r8_bday;
	//r9
	int r9_quantity, r9_age, r9_total, r9_price=270, r9_p, r9_change;
	char r9_fname, r9_lname, r9_email, r9_bday;
	//r10
	int r10_quantity, r10_age, r10_total, r10_price=160, r10_p, r10_change;
	char r10_fname, r10_lname, r10_email, r10_bday;
	//mystery
	//m1
	int m1_quantity, m1_age, m1_total, m1_price=220, m1_p, m1_change;
	char m1_fname, m1_lname, m1_email, m1_bday;
	//m2
	int m2_quantity, m2_age, m2_total, m2_price=320, m2_p, m2_change;
	char m2_fname, m2_lname, m2_email, m2_bday;
	//m3
	int m3_quantity, m3_age, m3_total, m3_price=100, m3_p, m3_change;
	char m3_fname, m3_lname, m3_email, m3_bday;
	//m4
	int m4_quantity, m4_age, m4_total, m4_price=180, m4_p, m4_change;
	char m4_fname, m4_lname, m4_email, m4_bday;
	//m5
	int m5_quantity, m5_age, m5_total, m5_price=120, m5_p, m5_change;
	char m5_fname, m5_lname, m5_email, m5_bday;
	//m6
	int m6_quantity, m6_age, m6_total, m6_price=200, m6_p, m6_change;
	char m6_fname, m6_lname, m6_email, m6_bday;
	//m7
	int m7_quantity, m7_age, m7_total, m7_price=290, m7_p, m7_change;
	char m7_fname, m7_lname, m7_email, m7_bday;
	//m8
	int m8_quantity, m8_age, m8_total, m8_price=220, m8_p, m8_change;
	char m8_fname, m8_lname, m8_email, m8_bday;
	//m9
	int m9_quantity, m9_age, m9_total, m9_price=140, m9_p, m9_change;
	char m9_fname, m9_lname, m9_email, m9_bday;
	//m10
	int m10_quantity, m10_age, m10_total, m10_price=210, m10_p, m10_change;
	char m10_fname, m10_lname, m10_email, m10_bday;	
	//horror
	//h1
	int h1_quantity, h1_age, h1_total, h1_price=170, h1_p, h1_change;
	char h1_fname, h1_lname, h1_email, h1_bday;	
	//h2
	int h2_quantity, h2_age, h2_total, h2_price=250, h2_p, h2_change;
	char h2_fname, h2_lname, h2_email, h2_bday;	
	//h3
	int h3_quantity, h3_age, h3_total, h3_price=270, h3_p, h3_change;
	char h3_fname, h3_lname, h3_email, h3_bday;	
	//h4
	int h4_quantity, h4_age, h4_total, h4_price=240, h4_p, h4_change;
	char h4_fname, h4_lname, h4_email, h4_bday;
	//h5
	int h5_quantity, h5_age, h5_total, h5_price=400, h5_p, h5_change;
	char h5_fname, h5_lname, h5_email, h5_bday;	
	//h6
	int h6_quantity, h6_age, h6_total, h6_price=220, h6_p, h6_change;
	char h6_fname, h6_lname, h6_email, h6_bday;	
	//h7
	int h7_quantity, h7_age, h7_total, h7_price=160, h7_p, h7_change;
	char h7_fname, h7_lname, h7_email, h7_bday;
	//h8
	int h8_quantity, h8_age, h8_total, h8_price=100, h8_p, h8_change;
	char h8_fname, h8_lname, h8_email, h8_bday;	
	//h9
	int h9_quantity, h9_age, h9_total, h9_price=320, h9_p, h9_change;
	char h9_fname, h9_lname, h9_email, h9_bday;
	//h10
	int h10_quantity, h10_age, h10_total, h10_price=210, h10_p, h10_change;
	char h10_fname, h10_lname, h10_email, h10_bday;	
	//short stories
	//ss1
	int ss1_quantity, ss1_age, ss1_total, ss1_price=270, ss1_p, ss1_change;
	char ss1_fname, ss1_lname, ss1_email, ss1_bday;	
	//ss2
	int ss2_quantity, ss2_age, ss2_total, ss2_price=210, ss2_p, ss2_change;
	char ss2_fname, ss2_lname, ss2_email, ss2_bday;
	//ss3
	int ss3_quantity, ss3_age, ss3_total, ss3_price=470, ss3_p, ss3_change;
	char ss3_fname, ss3_lname, ss3_email, ss3_bday;
	//ss4
	int ss4_quantity, ss4_age, ss4_total, ss4_price=300, ss4_p, ss4_change;
	char ss4_fname, ss4_lname, ss4_email, ss4_bday;	
	//ss5
	int ss5_quantity, ss5_age, ss5_total, ss5_price=400, ss5_p, ss5_change;
	char ss5_fname, ss5_lname, ss5_email, ss5_bday;
	//ss6
	int ss6_quantity, ss6_age, ss6_total, ss6_price=220, ss6_p, ss6_change;
	char ss6_fname, ss6_lname, ss6_email, ss6_bday;	
	//ss7
	int ss7_quantity, ss7_age, ss7_total, ss7_price=110, ss7_p, ss7_change;
	char ss7_fname, ss7_lname, ss7_email, ss7_bday;
	//ss8
	int ss8_quantity, ss8_age, ss8_total, ss8_price=310, ss8_p, ss8_change;
	char ss8_fname, ss8_lname, ss8_email, ss8_bday;	
	//ss9
	int ss9_quantity, ss9_age, ss9_total, ss9_price=300, ss9_p, ss9_change;
	char ss9_fname, ss9_lname, ss9_email, ss9_bday;
	//ss10
	int ss10_quantity, ss10_age, ss10_total, ss10_price=210, ss10_p, ss10_change;
	char ss10_fname, ss10_lname, ss10_email, ss10_bday;	
	//poetry
	//p1
	int p1_quantity, p1_age, p1_total, p1_price=170, p1_p, p1_change;
	char p1_fname, p1_lname, p1_email, p1_bday;
    //p2
	int p2_quantity, p2_age, p2_total, p2_price=250, p2_p, p2_change;
	char p2_fname, p2_lname, p2_email, p2_bday;
	//p3
	int p3_quantity, p3_age, p3_total, p3_price=270, p3_p, p3_change;
	char p3_fname, p3_lname, p3_email, p3_bday;
	//p4
	int p4_quantity, p4_age, p4_total, p4_price=240, p4_p, p4_change;
	char p4_fname, p4_lname, p4_email, p4_bday;
	//p5
	int p5_quantity, p5_age, p5_total, p5_price=400, p5_p, p5_change;
	char p5_fname, p5_lname, p5_email, p5_bday;
	//p6
	int p6_quantity, p6_age, p6_total, p6_price=220, p6_p, p6_change;
	char p6_fname, p6_lname, p6_email, p6_bday;
	//p7
	int p7_quantity, p7_age, p7_total, p7_price=160, p7_p, p7_change;
	char p7_fname, p7_lname, p7_email, p7_bday;
	//p8
	int p8_quantity, p8_age, p8_total, p8_price=100, p8_p, p8_change;
	char p8_fname, p8_lname, p8_email, p8_bday;
	//p9
	int p9_quantity, p9_age, p9_total, p9_price=320, p9_p, p9_change;
	char p9_fname, p9_lname, p9_email, p9_bday;
	//p10
	int p10_quantity, p10_age, p10_total, p10_price=210, p10_p, p10_change;
	char p10_fname, p10_lname, p10_email, p10_bday;
	
	//registration
	clrscr();
	do {
	g(29,3);
	printf("WELCOME TO BOOKTRONIC");
	g(3,6);
	printf("-*-*-*-*-*-*-*-*-*-*-*-*-*-*- REGISTRATION -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&age);
	g(13,12);
	printf("Phone Number: ");
	g(55,12);
	scanf("%d",&pnum);
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
	
	//GENRE MENU
	clrscr();
	genre: do {
	g(31,3);
	printf("WELCOME %s!",fname);
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
	scanf("%d",&choice);

	if(choice==1) {
	g(24,23);
	printf("Directing to Romance Genre.....");
	getch();
	clrscr();
	
	//ROMANCE GENRE
	romance: do {
	g(33,3);
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

	  if(r_c==1) {
	
		//ROMANCE EBOOK 1
	  clrscr();
	  g(32,3);
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
	g(35,14);
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
	  scanf("%d",&rchoice);

	  if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(32,3);
	printf("He's Into Her");
	g(28,6);
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

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r1_p<200){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	  } else if(rchoice==2) {
	  clrscr();
	  }


	  } else if(r_c==2) {
	  	
	  	//ROMANCE EBOOK 2
	  clrscr();
	  g(26,3);
	  printf("Ang Boyfriend Kong Artista");

	  g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("One night, I waited for hours to see a falling star. But when I finally");
	g(5,10);
	delay(700);
	printf("caught sight of it, it was gone bago pa man ako makapag-wish. That night");
	g(5,11);
	delay(700);
	printf(", I vowed to never look up at the sky again. ");
	g(35,14);
	delay(700);
	printf("Tagline");
	g(15,16);
	delay(700);
	printf("The superstar is shining, can i still reach him?");
	g(30,18);
	printf("Ebook Price: 150");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	 g(26,3);
	printf("Ang Boyfriend Kong Artista");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r2_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r2_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r2_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r2_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r2_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r2_quantity);
	r2_total = r2_quantity*r2_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r2_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r2_p);

	if(r2_p>=150) {

	r2_change = r2_p - r2_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r2_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r2_p<150){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	}

	  } else if(rchoice==2) {
	  clrscr();
	  }


	  } else if(r_c==3) {
	  	
	  	//ROMANCE EBOOK 3
	  clrscr();
	  g(34,3);
	  printf("His Slave");

	  g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Fake relationship in exchange of paying all of debts and the hospital");
	g(5,10);
	delay(700);
	printf("bills of your comatose mother. Or your dignity and pride in exchange of");
	g(5,11);
	delay(700);
	printf("being in debt, plus, you won't have a chance to pay the hospital bills.");
	g(5,12);
	delay(700);
	printf("Now... what?");
	g(35,14);
	delay(700);
	printf("Tagline");
	g(15,16);
	delay(700);
	printf("Be my slaves and I'll pay for all your expenses");
	g(30,18);
	printf("Ebook Price: 200");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(34,3);
	printf("His Slave");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r3_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r3_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r3_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r3_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r3_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r3_quantity);
	r3_total = r3_quantity*r3_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r3_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r3_p);

	if(r3_p>=200) {

	r3_change = r3_p - r3_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r3_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r3_p<200){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(rchoice==2) {
	clrscr();
	}

	  } else if(r_c==4) {
	  	
	  	//ROMANCE EBOOK 4
	  clrscr();
	  g(31,3);
	printf("Players Academy");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Kapag nakatanggap ka ng isang inbitasyong makapasok sa isang Exclusive at");
	g(5,10);
	delay(700);
	printf("Pinakaprestilyosong school sa Manila. Tatangapin mo ba ang offer? Eh pano");
	g(5,11);
	delay(700);
	printf("kung hindi ito pangkaraniwang school lang.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(23,16);
	delay(700);
	printf("Fall In Love with a Heartbreak");
	g(30,18);
	printf("Ebook Price: 170");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(31,3);
	printf("Players Academy");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r4_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r4_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r4_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r4_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r4_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r4_quantity);
	r4_total = r4_quantity*r4_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r4_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r4_p);

	if(r4_p>=170) {

	r4_change = r4_p - r4_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r4_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r4_p<170){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(rchoice==2) {
	clrscr();
	}


	  } else if(r_c==5) {
	  	
	  	//ROMANCE EBOOK 5
	  clrscr();
	  g(29,3);
	printf("The Mistletoe Motive");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("He loathes the holidays. She loves them. She’s full of festive cheer.");
	g(5,10);
	delay(700);
	printf("He’s brimming with Bah, Humbugs. Besides unreasonably seasonable names,");
	g(5,11);
	delay(700);
	printf("the only thing Jonathan Frost and Gabriella Di Natale have in common is");
	g(5,12);
	delay(700);
	printf("a healthy dose of mutual contempt.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(22,16);
	delay(700);
	printf("Mistletoe. I surmount all obstacles.");
	g(30,18);
	printf("Ebook Price: 130");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(29,3);
	printf("The Mistletoe Motive");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r5_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r5_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r5_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r5_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r5_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r5_quantity);
	r5_total = r5_quantity*r5_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r5_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r5_p);

	if(r5_p>=130) {

	r5_change = r5_p - r5_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r5_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r5_p<130){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}
	} else if(rchoice==2) {
	clrscr();
	}

	  } else if(r_c==6) {
	  	
	  	//ROMANCE EBOOK 6
	  clrscr();
	  g(29,3);
	printf("The Love Hypothesis");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("When a fake relationship between scientists meets the irresistible force");
	g(5,10);
	delay(700);
	printf("of attraction, it throws one woman's carefully calculated theories on love");
	g(5,11);
	delay(700);
	printf("into chaos.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(12,16);
	delay(700);
	printf("I'm starting to wonder if this is what being in love is.");
	g(30,18);
	printf("Ebook Price: 220");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(29,3);
	printf("The Love Hypothesis");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r6_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r6_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r6_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r6_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r6_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r6_quantity);
	r6_total = r6_quantity*r6_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r6_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r6_p);

	if(r6_p>=220) {

	r6_change = r6_p - r6_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r6_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r6_p<220){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(rchoice==2) {
	clrscr();
	}

	  } else if(r_c==7) {
	  	
	  	//ROMANCE EBOOK 7
	  clrscr();
	  g(29,3);
	printf("Take It or Leave It");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Story of a girl who is obliged to choose between her family and her love.");
	g(5,10);
	delay(700);
	printf("Who will she choose to save in life's great game? Her loved ones, or HER");
	g(5,11);
	delay(700);
	printf("GREAT LOVE?");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(26,16);
	delay(700);
	printf("Will I take it or leave it?");
	g(30,18);
	printf("Ebook Price: 250");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(29,3);
	printf("Take It or Leave It");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r7_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r7_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r7_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r7_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r7_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r7_quantity);
	r7_total = r7_quantity*r7_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r7_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r7_p);

	if(r7_p>=250) {

	r7_change = r7_p - r7_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r7_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r7_p<250){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(rchoice==2) {
	clrscr();
	}

	  } else if(r_c==8) {
	  	
	  	//ROMANCE EBOOK 8
	  clrscr();
	  g(30,3);
	printf("Love Without Limits");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Zaimin Yaz believed that falling in love after a heartbreak is the most");
	g(5,10);
	delay(700);
	printf("impossible thing ever. But meeting Maxwell Laurent del Valle, the most");
	g(5,11);
	delay(700);
	printf("handsome man she have ever met, proved her wrong.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(20,16);
	delay(700);
	printf("I guess my love for you has no limits.");
	g(30,18);
	printf("Ebook Price: 200");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(30,3);
	printf("Love Without Limits");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r8_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r8_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r8_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r8_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r8_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r8_quantity);
	r8_total = r8_quantity*r8_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r8_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r8_p);

	if(r8_p>=200) {

	r8_change = r8_p - r8_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r8_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r8_p<200){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(rchoice==2) {
	clrscr();
	}

	  } else if(r_c==9) {
	  	
	  	//ROMANCE EBOOK 9
	  clrscr();
	  g(28,3);
	printf("101 Days of Heartbreak");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Lawrence has always been the heartthrob in their campus. But when Yuri");
	g(5,10);
	delay(700);
	printf("came, everything changed. Knowing her lover is popular, she entered the");
	g(5,11);
	delay(700);
	printf("relationship without thinking about the consequences.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(10,16);
	delay(700);
	printf("What happens when the broken-hearted hurts the heart breaker?");
	g(30,18);
	printf("Ebook Price: 270");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(28,3);
	printf("101 Days of Heartbreak");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r9_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r9_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r9_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r9_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r9_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r9_quantity);
	r9_total = r9_quantity*r9_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r9_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r9_p);

	if(r9_p>=270) {

	r9_change = r9_p - r9_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r9_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r9_p<270){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(rchoice==2) {
	clrscr();

	}

	  } else if(r_c==10) {

	//ROMANCE EBOOK 10
	clrscr();
	g(30,3);
	printf("Just the Benefits");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Imogen Harrison has been dating campus heartthrob Parker Yapchengco.");
	g(5,10);
	delay(700);
	printf("But no one knows about it., Bagaman pumayag si Imogen na ilihim nila");
	g(5,11);
	delay(700);
	printf("ni Parker ang kanilang relasyon ay hindi nawawala ang kanyang mga");
	g(5,12);
	delay(700);
	printf("agam-agam tungkol dito.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(4,16);
	delay(700);
	printf("Will she be selfish and stay with Parker while keeping Shiloah by her side?");
	g(30,18);
	printf("Ebook Price: 160");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&rchoice);

		if(rchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

		g(30,3);
	printf("Just the Benefits");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&r10_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&r10_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&r10_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&r10_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&r10_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&r10_quantity);
	r10_total = r10_quantity*r10_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",r10_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&r10_p);

	if(r10_p>=160) {

	r10_change = r10_p - r10_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",r10_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(r10_p<160){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(rchoice==2) {
	clrscr();
	goto romance;
	} else {
		g(26,23);
		printf("Invalid choice!");
		getch();
		clrscr();

	}

	  } else if(r_c==11) {
	  clrscr();
	  goto genre;
	  } else {
		g(29,23);
	  printf("invalid choice!");
	  getch();
	  clrscr();
	  goto romance;
	  }

	  } while(rchoice==2);


	  } else if(choice==2) {

	g(24,23);
	printf("Directing to Mystery Genre.....");
	getch();
	clrscr();

	//MYSTERY GENRE
	mystery: do {
	g(33,3);
	printf("MYSTERY GENRE");
	g(30,6);
	printf("Select Ebook You Want");
	g(13,10);
	printf("[1] Hell University");
	g(13,11);
	printf("[2] Chasing Hell");
	g(13,12);
	printf("[3] Tantei High");
	g(13,13);
	printf("[4] Why She Left");
	g(13,14);
	printf("[5] Angels & Demons");
	g(42,10);
	printf("[6] The Girl With The Dragon Tattoo");
	g(42,11);
	printf("[7] The Silence Of The Lambs");
	g(42,12);
	printf("[8] And Then There Were None");
	g(42,13);
	printf("[9] Manila Noir");
	g(42,14);
	printf("[10] Smaller and Smaller Circles");
	g(34,18);
	printf("[11] Back");
	g(29,22);
	printf("Your choice: ");
	scanf("%d",&m_c);

		if(m_c==1) {
		
		//MYSTERY EBOOK 1	
	clrscr();
	g(31,3);
	printf("Hell University");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("A place where everything is mysterious, enchanting, bloody, and shitty.");
	g(5,10);
	delay(700);
	printf("Entering is the other way of suicidal. Just one wrong move and");
	g(5,11);
	delay(700);
	printf("everything will blur.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(19,16);
	delay(700);
	printf("Once you enter, there's no turning back");
	g(30,18);
	printf("Ebook Price: 220");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(31,3);
	printf("Hell University");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m1_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m1_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m1_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m1_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m1_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m1_quantity);
	m1_total = m1_quantity*m1_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m1_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m1_p);

	if(m1_p>=220) {

	m1_change = m1_p - m1_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m1_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m1_p<220){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}

		} else if(m_c==2) {
			
	//MYSTERY EBOOK 2
	clrscr();
	g(33,3);
	printf("Chasing Hell");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Napatingin ako sa picture kong sinend nya. Nasa sementeryo ako at may");
	g(5,10);
	delay(700);
	printf("hawak na cellphone. Nakaedit ito na parang binabalutan ng dugo.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(7,16);
	delay(700);
	printf("Did you liked your adventure? It's cool, right? I want to play more");
	g(30,18);
	printf("Ebook Price: 320");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(33,3);
	printf("Chasing Hell");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m2_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m2_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m2_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m2_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m2_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m2_quantity);
	m2_total = m2_quantity*m2_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m2_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m2_p);

	if(m2_p>=320) {

	m2_change = m2_p - m2_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m2_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m2_p<320){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}

		} else if(m_c==3) {
		
	//MYSTERY EBOOK 3	
	clrscr();
	g(33,3);
	printf("Tantei High");
	g(33,7);
	delay(100);
	printf("Description");
	g(11,9);
	delay(700);
	printf("Do you have a special talent? Do you have a great mind? ");
	g(21,10);
	delay(700);
	printf("Do you have the courage to fight?");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(21,16);
	delay(700);
	printf("Not your ordinary detective story");
	g(30,18);
	printf("Ebook Price: 100");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();
	  
	  g(33,3);
	printf("Tantei High");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m3_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m3_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m3_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m3_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m3_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m3_quantity);
	m3_total = m3_quantity*m3_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m3_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m3_p);

	if(m3_p>=100) {

	m3_change = m3_p - m3_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m3_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();
	
	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m3_p<100){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}


		} else if(m_c==4) {
		
	//MYSTERY EBOOK 4	
	clrscr();
	g(32,3);
	printf("Why She Left");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("When I open the door and see her, my mind starts churning.");
	g(5,10);
	delay(700);
	printf("Why are they here? What do they want? And why did my daughter");
	g(5,11);
	delay(700);
	printf("leave in the first place?");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(10,16);
	delay(700);
	printf("Fifteen years ago, her daughter vanished. Now, she’s back");
	g(30,18);
	printf("Ebook Price: 180");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(32,3);
	printf("Why She Left");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m4_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m4_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m4_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m4_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m4_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m4_quantity);
	m4_total = m4_quantity*m4_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m4_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m4_p);

	if(m4_p>=180) {

	m4_change = m4_p - m4_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m4_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m4_p<180){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}

		} else if(m_c==5) {
			
	//MYSTERY EBOOK 5
	clrscr();
	g(32,3);
	printf("Angels & Demons");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("World-renowned Harvard symbologist Robert Langdon is summoned");
	g(5,10);
	delay(700);
	printf("to a Swiss research facility to analyze a cryptic symbol");
	g(5,11);
	delay(700);
	printf("seared into the chest of a murdered physicist.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(20,16);
	delay(700);
	printf("Religion is like language or dress.");
	g(30,18);
	printf("Ebook Price: 120");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

		g(32,3);
	printf("Angels & Demons");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m5_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m5_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m5_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m5_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m5_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m5_quantity);
	m5_total = m5_quantity*m5_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m5_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m5_p);

	if(m5_p>=120) {

	m5_change = m5_p - m5_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m5_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m5_p<120){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}


		} else if(m_c==6) {
	
	//MYSTERY EBOOK 6
	clrscr();
	g(24,3);
	printf("The Girl with the Dragon Tattoo");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("All these years later, her aged uncle continues to seek the truth.");
	g(5,10);
	delay(700);
	printf("He hires Mikael Blomkvist, a crusading journalist recently trapped");
	g(5,11);
	delay(700);
	printf("by a libel conviction, to investigate.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(28,16);
	delay(700);
	printf("Everyone has secrets.");
	g(30,18);
	printf("Ebook Price: 200");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(24,3);
	printf("The Girl with the Dragon Tattoo");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m6_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m6_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m6_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m6_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m6_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m6_quantity);
	m6_total = m6_quantity*m6_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m6_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m6_p);

	if(m6_p>=200) {

	m6_change = m6_p - m6_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m6_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m6_p<200){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}


		} else if(m_c==7) {
			
	//MYSTERY EBOOK 7
	clrscr();
	g(27,3);
	printf("The Silence of the Lambs");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("A young FBI trainee. An evil genius locked away for unspeakable crimes.");
	g(5,10);
	delay(700);
	printf("A plunge into the darkest chambers of a psychopath's mind--in the");
	g(5,11);
	delay(700);
	printf("deadly search for a serial killer.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(5,16);
	delay(700);
	printf("Problem-solving is hunting; it's savage pleasure and we're born to it");
	g(30,18);
	printf("Ebook Price: 290");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(27,3);
	printf("The Silence of the Lambs");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m7_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m7_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m7_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m7_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m7_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m7_quantity);
	m7_total = m7_quantity*m7_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m7_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m7_p);

	if(m7_p>=290) {

	m7_change = m7_p - m7_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m7_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m7_p<290){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}


		} else if(m_c==8) {
	
	//MYSTERY EBOOK 8
	clrscr();
	g(27,3);
	printf("And Then There Were None");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Try and vary your methods as you will, your tastes, your habits");
	g(5,10);
	delay(700);
	printf("your attitude of mind, and your soul is revealed by your actions.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(25,16);
	delay(700);
	printf("Crime is terribly revealing.");
	g(30,18);
	printf("Ebook Price: 220");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(27,3);
	printf("And Then There Were None");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m8_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m8_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m8_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m8_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m8_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m8_quantity);
	m8_total = m8_quantity*m8_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m8_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m8_p);

	if(m8_p>=220) {

	m2_change = m8_p - m8_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m8_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m8_p<220){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}

		} else if(m_c==9) {
	
	//MYSTERY EBOOK 9		
	clrscr();
	g(33,3);
	printf("Manila Noir");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Manila’s a city of survivors, schemers, and dreamers. A city of ");
	g(5,10);
	delay(700);
	printf("extremes. Where the rich live in posh enclaves, guarded by ");
	g(5,11);
	delay(700);
	printf("men with guns.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(15,16);
	delay(700);
	printf("I like to think of Manila as a woman of mystery");
	g(30,18);
	printf("Ebook Price: 140");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(33,3);
	printf("Manila Noir");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m9_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m9_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m9_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m9_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m9_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m9_quantity);
	m9_total = m9_quantity*m9_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m9_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m9_p);

	if(m9_p>=140) {

	m9_change = m9_p - m9_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m9_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m9_p<140){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	}
			
		} else if(m_c==10) {
	
	//MYSTERY EBOOK 10		
	clrscr();
	g(25,3);
	printf("Smaller and Smaller Circles");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Together with his protégé, Father Jerome Lucero, a psychologist,");
	g(5,10);
	delay(700);
	printf("Saenz dedicates himself to tracking down the monster preying");
	g(5,11);
	delay(700);
	printf("on these impoverished boys.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(5,16);
	delay(700);
	printf("Some things are better dealt within the cleansing light of transparency");
	g(30,18);
	printf("Ebook Price: 210");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&mchoice);

		if(mchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	  g(25,3);
	printf("Smaller and Smaller Circles");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&m10_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&m10_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&m10_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&m10_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&m10_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&m10_quantity);
	m10_total = m10_quantity*m10_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",m10_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&m10_p);

	if(m10_p>=210) {

	m10_change = m10_p - m10_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",m10_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(m10_p<210){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(mchoice==2) {
	clrscr();
	goto mystery;
	}
			
			
		} else if(m_c==11) {
	  clrscr();
	  goto genre;
	  } else {
		g(29,23);
	  printf("invalid choice!");
	  getch();
	  clrscr();
	  goto mystery;
	  }
	  
	  } while(mchoice==2);
	  
	  

	  } else if(choice==3) {
	  g(24,23);
	printf("Directing to Horror Genre.....");
	getch();
	clrscr();

	//HORROR GENRE
	horror: do {
	g(34,3);
	printf("HORROR GENRE");
	g(30,6);
	printf("Select Ebook You Want");
	g(11,10);
	printf("[1] Dracula");
	g(11,11);
	printf("[2] Frankenstein");
	g(11,12);
	printf("[3] The Last Werewolf");
	g(11,13);
	printf("[4] The Passage");
	g(11,14);
	printf("[5] Ring");
	g(44,10);
	printf("[6] Beloved");
	g(44,11);
	printf("[7] The Call of Cthulhu and");
	g(48,12);
	printf("Other Weird Stories");
	g(44,13);
	printf("[8] The Case Against Satan");
	g(44,14);
	printf("[9] Come Closer");
	g(44,15);
	printf("[10] World War Z");
	g(34,18);
	printf("[11] Back");
	g(29,22);
	printf("Your choice: ");
	scanf("%d",&h_c);

		if(h_c==1) {
		
	//HORROR EBOOK 1	
	clrscr();
	g(35,3);
	printf("Dracula");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("It begins with Jonathan Harker, a young English lawyer, as he travels");
	g(5,10);
	delay(700);
	printf("to Transylvania. Harker plans to meet with Count Dracula, a client of");
	g(5,11);
	delay(700);
	printf("his firm, in order to finalize a property transaction.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(12,16);
	delay(700);
	printf("There are darknesses in life and there are lights.");
	g(30,18);
	printf("Ebook Price: 170");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(35,3);
	printf("Dracula");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h1_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h1_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h1_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h1_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h1_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h1_quantity);
	h1_total = h1_quantity*h1_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h1_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h1_p);

	if(h1_p>=170) {

	h1_change = h1_p - h1_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h1_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(h1_p<170){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}
	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==2) {

	//HORROR EBOOK 2
	clrscr();
	g(33,3);
	printf("Frankenstein");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Frankenstein tells the story of gifted scientist Victor Frankenstein who");
	g(5,10);
	delay(700);
	printf("succeeds in giving life to a being of his own creation. However, this is");
	g(5,11);
	delay(700);
	printf("not the perfect specimen he imagines that it will be.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(12,16);
	delay(700);
	printf("Beware, for I am fearless, and therefore powerful.");
	g(30,18);
	printf("Ebook Price: 250");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(33,3);
	printf("Frankenstein");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h2_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h2_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h2_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h2_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h2_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h2_quantity);
	h2_total = h2_quantity*h2_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h2_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h2_p);

	if(h2_p>=250) {

	h2_change = h2_p - h2_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h2_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(h2_p<250){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	}

	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==3) {

	//HORROR EBOOK 3
	clrscr();
	g(30,3);
	printf("The Last Werewolf");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Jacob Marlowe has lost the will to live. For two hundred years he has");
	g(5,10);
	delay(700);
	printf("wandered the world, enslaved by his lunatic appetites and tormented by");
	g(5,11);
	delay(700);
	printf("the memory of his first and most monstrous crime.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(15,16);
	delay(700);
	printf("You love life because life's all there is.");
	g(30,18);
	printf("Ebook Price: 270");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(30,3);
	printf("The Last Werewolf");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h3_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h3_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h3_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h3_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h3_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h3_quantity);
	h3_total = h3_quantity*h3_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h3_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h3_p);

	if(h3_p>=200) {

	h3_change = h3_p - h3_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h3_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(h3_p<200){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==4) {

	//HORROR EBOOK 4
	clrscr();
	g(33,3);
	printf("The Passage");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("An epic and gripping tale of catastrophe and survival, The Passage is the");
	g(5,10);
	delay(700);
	printf("story of Amy—abandoned by her mother at the age of six, pursued and then");
	g(5,11);
	delay(700);
	printf("imprisoned by the shadowy figures behind a government experiment.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(7,16);
	delay(700);
	printf("What strange places our lives can carry us to, what dark passages");
	g(30,18);
	printf("Ebook Price: 240");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(33,3);
	printf("The Passage");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h4_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h4_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h4_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h4_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h4_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h4_quantity);
	h4_total = h4_quantity*h4_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h4_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h4_p);

	if(h4_p>=240) {

	h4_change = h4_p - h4_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h4_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;


	} else if(h4_p<240){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==5) {

	//HORROR EBOOK 5
	clrscr();
	g(36,3);
	printf("Ring");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("After 4 teenagers mysteriously die simultaneously in Tokyo, Kazuyuki");
	g(5,10);
	delay(700);
	printf("Asakawa, a reporter and uncle to one of the deceased, decides to");
	g(5,11);
	delay(700);
	printf("launch his own personal investigation.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(16,16);
	delay(700);
	printf("Think! There's nothing certain in our future!");
	g(30,18);
	printf("Ebook Price: 400");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(36,3);
	printf("Ring");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h5_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h5_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h5_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h5_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h5_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h5_quantity);
	h5_total = h5_quantity*h5_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h5_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h5_p);

	if(h5_p>=400) {

	h5_change = h5_p - h5_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h5_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(h5_p<400){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==6) {

	//HORROR EBOOK 6
	clrscr();
	g(34,3);
	printf("Beloved");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("The work examines the destructive legacy of slavery as it chronicles the");
	g(5,10);
	delay(700);
	printf("life of a Black woman named Sethe, from her pre-Civil War days as a slave");
	g(5,11);
	delay(700);
	printf("in Kentucky to her time in Cincinnati.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(12,16);
	delay(700);
	printf("Claiming ownership of that freed self was another.");
	g(30,18);
	printf("Ebook Price: 220");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(34,3);
	printf("Beloved");
	g(27,6);
	printf("PURCHASING TRANSACTION");
	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h6_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h6_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h6_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h6_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h6_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h6_quantity);
	h6_total = h6_quantity*h6_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h6_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h6_p);

	if(h6_p>=220) {

	h6_change = h6_p - h6_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h6_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;


	} else if(h6_p<220){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==7) {

	//HORROR EBOOK 7
	clrscr();
	g(17,3);
	printf("The Call of Cthulhu and Other Weird Stories");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Howard Philips Lovecraft reinvented the horror genre in the 1920s,");
	g(5,10);
	delay(700);
	printf("discarding ghosts and witches and instead envisioning mankind as a");
	g(5,11);
	delay(700);
	printf("tiny outpost of dwindling sanity in chaotic and malevolent universe.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(20,16);
	delay(700);
	printf("We live on a placid island of ignorance");
	g(30,18);
	printf("Ebook Price: 160");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(17,3);
	printf("The Call of Cthulhu and Other Weird Stories");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h7_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h7_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h7_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h7_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h7_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h7_quantity);
	h7_total = h7_quantity*h7_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h7_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h7_p);

	if(h7_p>=160) {

	h7_change = h7_p - h7_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h7_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(h7_p<160){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==8) {

	//HORROR EBOOK 8
	clrscr();
	g(28,3);
	printf("The Case Against Satan");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Susan Garth, who we're told had “recently been a devout girl who attended");
	g(5,10);
	delay(700);
	printf("Mass regularly,” has started to feel a visceral revulsion at the idea of");
	g(5,11);
	delay(700);
	printf("entering a church.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(15,16);
	delay(700);
	printf("I doubt if there was anything there to begin with.");
	g(30,18);
	printf("Ebook Price: 100");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(28,3);
	printf("The Case Againts Satan");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h8_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h8_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h8_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h8_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h8_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h8_quantity);
	h8_total = h8_quantity*h8_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h8_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h8_p);

	if(h8_p>=100) {

	h8_change = h8_p - h8_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h8_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(h8_p<100){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==9) {

	//HORROR EBOOK 9
	clrscr();
	g(33,3);
	printf("Come Closer");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("It tells the story of Amanda who is a successful architect with a loving");
	g(5,10);
	delay(700);
	printf("husband and a lovely home life, but things are not as they seem.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(13,16);
	delay(700);
	printf("We could devote our lives to making sense of the odd");
	g(30,18);
	printf("Ebook Price: 320");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(33,3);
	printf("Come Closer");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h9_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h9_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h9_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h9_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h9_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h9_quantity);
	h9_total = h9_quantity*h9_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h9_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h9_p);

	if(h9_p>=320) {

	h9_change = h9_p - h9_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h9_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(h9_p<320){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(hchoice==2) {
	clrscr();
	}

		} else if(h_c==10) {

	//HORROR EBOOK 10
	clrscr();
	g(33,3);
	printf("World War Z");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("A novel by Max Brooks which depicts a fictional outbreak of the Solanum");
	g(5,10);
	delay(700);
	printf("virus in China during the mid-2000s. It shows the social, economic,");
	g(5,11);
	delay(700);
	printf("political, cultural, technological, and ecological effects of a zombie");
	g(5,12);
	delay(700);
	printf("apocalypse.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(10,16);
	delay(700);
	printf("That's not stupidity or weakness, that's just human nature.");
	g(30,18);
	printf("Ebook Price: 210");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&hchoice);

		if(hchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(33,3);
	printf("World War Z");
	g(27,6);
	printf("PURCHASING TRANSACTION");
	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&h10_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&h10_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&h10_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&h10_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&h10_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&h10_quantity);
	h10_total = h10_quantity*h10_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",h10_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&h10_p);

	if(h10_p>=210) {

	h10_change = h10_p - h10_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",h10_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();
	
	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	

	} else if(h10_p<210){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(hchoice==2) {
	clrscr();
	goto horror;
	}
			
			
		} else if(h_c==11) {
		clrscr();
	 	 goto genre;
			
		} else {
			g(29,23);
			printf("Invalid choice!");
			getch();
			clrscr();
			goto horror;
		}
		
		
	
	} while(hchoice==2);
	
	

	  } else if(choice==4) {
	  	
	g(24,23);
	printf("Directing to Short Stories Genre.....");
	getch();
	clrscr();
	
	//SHORT STORIES GENRE
	s_stories: do {
	g(31,3);
	printf("SHORT STORIES GENRE");
	g(30,6);
	printf("Select Ebook You Want");
	g(7,10);
	printf("[1] The Thing Around Your Neck");
	g(7,11);
	printf("[2] Sour Heart");
	g(7,12);
	printf("[3] After the Quake");
	g(7,13);
	printf("[4] The Largesse of the Sea Maiden");
	g(7,14);
	printf("[5] Tenth of December");
	g(43,10);
	printf("[6] This Is How You Lose Her");
	g(43,11);
	printf("[7] 13 Ways of Looking at a Fat Girl");
	g(43,12);
	printf("[8] What Is Not Yours Is Not Yours");
	g(43,13);
	printf("[9] The Dark Dark");
	g(43,14);
	printf("[10] Fortune Smiles");
	g(34,18);
	printf("[11] Back");
	g(29,22);
	printf("Your choice: ");
	scanf("%d",&ss_c);

		if(ss_c==1) {
			
	//SHORT STORIES EBOOK 1
	clrscr();
	g(27,3);
	printf("The Thing Around Your Neck");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Akunna takes a bus to a small town in Connecticut and gets a job in a");
	g(5,10);
	delay(700);
	printf("restaurant. A white boy begins visiting and tries to talk to Akunna.");
	g(5,11);
	delay(700);
	printf("They soon begin a relationship, but the boy is rich and condescending.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(6,16);
	delay(700);
	printf("How can you love somebody and yet want to manage amount of happiness?");
	g(30,18);
	printf("Ebook Price: 270");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(27,3);
	printf("The Thing Around Your Neck");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss1_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss1_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss1_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss1_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss1_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss1_quantity);
	ss1_total = ss1_quantity*ss1_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss1_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss1_p);

	if(ss1_p>=270) {

	ss1_change = ss1_p - ss1_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss1_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;


	} else if(ss1_p<270){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}
	} else if(sschoice==2) {
	clrscr();
	}

		} else if(ss_c==2) {

	//SHORT STORIES EBOOK 2
	clrscr();
	g(33,3);
	printf("Sour Heart");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("In the absence of grown-ups, latchkey kids experiment on each other until");
	g(5,10);
	delay(700);
	printf("one day the experiments turn violent; an overbearing mother abandons her");
	g(5,11);
	delay(700);
	printf("artistic aspirations to come to America.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(12,16);
	delay(700);
	printf("I will always come home to my family as a visitor.");
	g(30,18);
	printf("Ebook Price: 210");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(33,3);
	printf("Sour Heart");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss2_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss2_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss2_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss2_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss2_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss2_quantity);
	ss2_total = ss2_quantity*ss2_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss2_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss2_p);

	if(ss2_p>=210) {

	ss2_change = ss2_p - ss2_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss2_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(ss2_p<210){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	}

	} else if(sschoice==2) {
	clrscr();
	}


		} else if(ss_c==3) {

	//SHORT STORIES EBOOK 3
	clrscr();
	g(31,3);
	printf("After the Quake");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("As haunting as dreams, as potent as oracles, the stories in After the");
	g(5,10);
	delay(700);
	printf("Quake are further proof that Murakami is one of the most visionary");
	g(5,11);
	delay(700);
	printf("writers at work today.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(19,16);
	delay(700);
	printf("You can never get away from yourself.");
	g(30,18);
	printf("Ebook Price: 470");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(31,3);
	printf("After the Quake");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss3_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss3_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss3_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss3_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss3_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss3_quantity);
	ss3_total = ss3_quantity*ss3_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss3_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss3_p);

	if(ss3_p>=470) {

	ss3_change = ss3_p - ss3_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss3_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(ss3_p<470){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(sschoice==2) {
	clrscr();
	}

		} else if(ss_c==4) {

	//SHORT STORIES EBOOK 4
	clrscr();
	g(25,3);
	printf("The Largesse of the Sea Maiden");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("It follows the groundbreaking, highly acclaimed Jesus' Son. Written in");
	g(5,10);
	delay(700);
	printf("the same luminous prose, this collection finds Johnson in new");
	g(5,11);
	delay(700);
	printf("territory contemplating old age, mortality.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(9,16);
	delay(700);
	printf("The Past just left. Its remnants, I claim, are mostly fiction");
	g(30,18);
	printf("Ebook Price: 300");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(25,3);
	printf("The Largesse of the Sea Maiden");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss4_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss4_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss4_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss4_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss4_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss4_quantity);
	ss4_total = ss4_quantity*ss4_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss4_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss4_p);

	if(ss4_p>=300) {

	ss4_change = ss4_p - ss4_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss4_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;


	} else if(ss4_p<300){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(sschoice==2) {
	clrscr();
	}

		} else if(ss_c==5) {

	//SHORT STORIES EBOOK 5
	clrscr();
	g(31,3);
	printf("Tenth of December");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("A hapless, deluded owner of an antiques store; two mothers struggling");
	g(5,10);
	delay(700);
	printf("to do the right thing; a teenage girl whose idealism is");
	g(5,11);
	delay(700);
	printf("challenged by a brutal brush with reality.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(13,16);
	delay(700);
	printf("Happiness that does not wilt to reveal the thin shoots");
	g(30,18);
	printf("Ebook Price: 400");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(31,3);
	printf("Tenth of December");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss5_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss5_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss5_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss5_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss5_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss5_quantity);
	ss5_total = ss5_quantity*ss5_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss5_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss5_p);

	if(ss5_p>=400) {

	ss5_change = ss5_p - ss5_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss5_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(ss5_p<400){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(sschoice==2) {
	clrscr();
	}

		} else if(ss_c==6) {

	//SHORT STORIES EBOOK 6
	clrscr();
	g(28,3);
	printf("This Is How You Lose Her");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("American man. In these stories about love, lust and infidelity, a good");
	g(5,10);
	delay(700);
	printf("man is hard to find and when he is found, he's always in bed with");
	g(5,11);
	delay(700);
	printf("someone else.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(21,16);
	delay(700);
	printf("The half-life of love is forever.");
	g(30,18);
	printf("Ebook Price: 220");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(28,3);
	printf("This Is How You Lose Her");
	g(27,6);
	printf("PURCHASING TRANSACTION");
	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss6_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss6_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss6_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss6_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss6_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss6_quantity);
	ss6_total = ss6_quantity*ss6_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss6_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss6_p);

	if(ss6_p>=220) {

	ss6_change = ss6_p - ss6_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss6_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;


	} else if(ss6_p<220){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(sschoice==2) {
	clrscr();
	}

		} else if(ss_c==7) {

	//SHORT STORIES EBOOK 7
	clrscr();
	g(23,3);
	printf("13 Ways of Looking at a Fat Girl");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Beth, the food-obsessed college student; then Elizabeth, the svelte");
	g(5,10);
	delay(700);
	printf(" married woman with an eating disorder; and finally, Liz, in her 30s");
	g(5,11);
	delay(700);
	printf(", thin but wanting.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(15,16);
	delay(700);
	printf("The universe is against us, which makes sense.");
	g(30,18);
	printf("Ebook Price: 110");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(23,3);
	printf("13 Ways of Looking at a Fat Girl");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss7_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss7_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss7_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss7_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss7_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss7_quantity);
	ss7_total = ss7_quantity*ss7_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss7_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss7_p);

	if(h7_p>=110) {

	ss7_change = ss7_p - ss7_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss7_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(ss7_p<110){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(sschoice==2) {
	clrscr();
	}

		} else if(ss_c==8) {

	//SHORT STORIES EBOOK 8
	clrscr();
	g(25,3);
	printf("What Is Not Yours Is Not Yours");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Oyeyemi's collection delves primarily into the human experience, but she");
	g(5,10);
	delay(700);
	printf("blends the stories together often with a fantastical twist.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(7,16);
	delay(700);
	printf("It was the usual struggle between one who loves by accepting burdens");
	g(30,18);
	printf("Ebook Price: 310");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(25,3);
	printf("What Is Not Yours Is Not Yours");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss8_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss8_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss8_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss8_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss8_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss8_quantity);
	ss8_total = ss8_quantity*ss8_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss8_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss8_p);

	if(ss8_p>=310) {

	ss8_change = ss8_p - ss8_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss8_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(ss8_p<310){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(sschoice==2) {
	clrscr();
	}

		} else if(ss_c==9) {

	//SHORT STORIES EBOOK 9
	clrscr();
	g(32,3);
	printf("The Dark Dark");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Two strangers become lovers and find themselves somehow responsible");
	g(5,10);
	delay(700);
	printf("for the resurrection of a dog. A woman tries to start her life anew");
	g(5,11);
	delay(700);
	printf("after loss of child but cannot help riddling that new life with lies.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(23,16);
	delay(700);
	printf("Some people enjoy humiliation.");
	g(30,18);
	printf("Ebook Price: 300");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(32,3);
	printf("The Dark Dark");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss9_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss9_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss9_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss9_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss9_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss9_quantity);
	ss9_total = ss9_quantity*ss9_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss9_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss9_p);

	if(ss9_p>=300) {

	ss9_change = ss9_p - ss9_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss9_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(ss9_p<300){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(sschoice==2) {
	clrscr();
	}

		} else if(ss_c==10) {

	//SHORT STORIES EBOOK 10
	clrscr();
	g(32,3);
	printf("Fortune Smiles");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("In Nirvana, the narrator tends to his wife, Charlotte, who has been");
	g(5,10);
	delay(700);
	printf("temporarily paralyzed following a bad flu.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(7,16);
	delay(700);
	printf("The truth is that you don't need to die to know what it's like");
	g(30,18);
	printf("Ebook Price: 210");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&sschoice);

		if(sschoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(32,3);
	printf("Fortune Smiles");
	g(27,6);
	printf("PURCHASING TRANSACTION");
	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&ss10_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&ss10_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&ss10_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&ss10_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&ss10_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&ss10_quantity);
	ss10_total = ss10_quantity*ss10_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",ss10_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&ss10_p);

	if(ss10_p>=210) {

	ss10_change = ss10_p - ss10_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",ss10_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;



	} else if(ss10_p<210){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(sschoice==2) {
	clrscr();
	goto s_stories;
	}

		} else if(ss_c==11) {
		clrscr();
	  	goto genre;

		} else {
			g(29,23);
			printf("Invalid choice!");
			getch();
			clrscr();
			goto s_stories;
		}



	} while(sschoice==2);



	  } else if(choice==5) {

	g(24,23);
	printf("Directing to Poetry Genre.....");
	getch();
	clrscr();

	//POETRY GENRE
	poetry: do {
	g(34,3);
	printf("POETRY GENRE");
	g(30,6);
	printf("Select Ebook You Want");
	g(11,10);
	printf("[1] Her");
	g(11,11);
	printf("[2] Him");
	g(11,12);
	printf("[3] A Fortune for Your Disaster");
	g(11,13);
	printf("[4] The Tradition");
	g(11,14);
	printf("[5] Earnest, Earnest?");
	g(44,10);
	printf("[6] Plainwater");
	g(44,11);
	printf("[7] The Wild Fox of Yemen");
	g(44,12);
	printf("[8] Milk and Honey");
	g(44,13);
	printf("[9] Odyssey");
	g(44,14);
	printf("[10] All Along You Were Blooming");
	g(34,18);
	printf("[11] Back");
	g(29,22);
	printf("Your choice: ");
	scanf("%d",&p_c);

		if(p_c==1) {

	//POETRY EBOOK 1
	clrscr();
	g(37,3);
	printf("Her");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("This is a beautiful expression of heartfelt emotion using short,");
	g(5,10);
	delay(700);
	printf("gratifying sentiments. If there is a lover in you, you will not");
	g(5,11);
	delay(700);
	printf("get enough of Her.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(9,16);
	delay(700);
	printf("I do not claim to be a great poet, but a great observer of her");
	g(30,18);
	printf("Ebook Price: 170");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(37,3);
	printf("Her");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p1_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p1_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p1_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p1_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p1_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p1_quantity);
	p1_total = p1_quantity*p1_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p1_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p1_p);

	if(p1_p>=170) {

	p1_change = p1_p - p1_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p1_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");


	} else if(p1_p<170){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}
	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}

		} else if(p_c==2) {
		clrscr();

	//POETRY EBOOK 2
	g(37,3);
	printf("Him");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("I started out writing to express my mistakes, my regrets, where I fell");
	g(5,10);
	delay(700);
	printf("short with love and women, and how I grew from those things.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(12,16);
	delay(700);
	printf("I will never fight for the men who can’t be men to women.");
	g(30,18);
	printf("Ebook Price: 250");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(37,3);
	printf("Him");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p2_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p2_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p2_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p2_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p2_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p2_quantity);
	p2_total = p2_quantity*p2_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p2_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p2_p);

	if(p2_p>=250) {

	p2_change = p2_p - p2_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p2_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");

	} else if(p2_p<250){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	}

	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}

		} else if(p_c==3) {

	//POETRY EBOOK 3
	clrscr();
	g(26,3);
	printf("A Fortune for Your Disaster");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Each poem uses a different setting to reflect the possibilities of the");
	g(5,10);
	delay(700);
	printf("self, using many elements to create music-like phrases");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(10,16);
	delay(700);
	printf("How can black people write about flowers at A time like this?");
	g(30,18);
	printf("Ebook Price: 270");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(26,3);
	printf("A Fortune for Your Disaster");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p3_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p3_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p3_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p3_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p3_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p3_quantity);
	p3_total = p3_quantity*p3_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p3_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p3_p);

	if(p3_p>=200) {

	p3_change = p3_p - p3_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p3_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");

	} else if(p3_p<200){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}

		} else if(p_c==4) {

	//POETRY EBOOK 4
	clrscr();
	g(32,3);
	printf("The Tradition");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Jericho Brown's collection is about the normalization of evil, our");
	g(5,10);
	delay(700);
	printf("histories of accepting it, and the ways in which we can stand in defiance.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(18,16);
	delay(700);
	printf("Men roam shirtless as if none ever hurt me");
	g(30,18);
	printf("Ebook Price: 240");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(32,3);
	printf("The Tradition");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p4_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p4_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p4_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p4_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p4_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p4_quantity);
	p4_total = p4_quantity*p4_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p4_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p4_p);

	if(p4_p>=240) {

	p4_change = p4_p - p4_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p4_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");


	} else if(p4_p<240){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}

		} else if(p_c==5) {

	//POETRY EBOOK 5
	clrscr();
	g(30,3);
	printf("Earnest, Earnest?");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Eleanor creates a story of sincerity, depicting an inner voice of");
	g(5,10);
	delay(700);
	printf("memory and fate that is a range of emotions in a bittersweet");
	g(5,11);
	delay(700);
	printf("collection.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(21,16);
	delay(700);
	printf("You don't seem to feel pain, Eleanor");
	g(30,18);
	printf("Ebook Price: 400");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(30,3);
	printf("Earnest, Earnest?");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p5_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p5_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p5_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p5_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p5_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p5_quantity);
	p5_total = p5_quantity*p5_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p5_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p5_p);

	if(p5_p>=400) {

	p5_change = p5_p - p5_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p5_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");

	} else if(p5_p<400){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}

		} else if(p_c==6) {

	//POETRY EBOOK 6
	clrscr();
	g(33,3);
	printf("Plainwater");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("While there are elements of thematic similarity between the different");
	g(5,10);
	delay(700);
	printf("sections, there is no singular narrative arc across them.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(16,16);
	delay(700);
	printf("We live by waters breaking out of the heart.");
	g(30,18);
	printf("Ebook Price: 220");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	clrscr();
	g(33,3);
	printf("Plainwater");
	g(27,6);
	printf("PURCHASING TRANSACTION");
	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p6_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p6_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p6_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p6_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p6_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p6_quantity);
	p6_total = p6_quantity*p6_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p6_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p6_p);

	if(p6_p>=220) {

	p6_change = p6_p - p6_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p6_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");


	} else if(p6_p<220){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}

		} else if(p_c==7) {

	//POETRY EBOOK 7
	clrscr();
	g(29,3);
	printf("The Wild Fox of Yemen");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Almontaser’s polyvocal collection sneaks artifacts to and from worlds");
	g(5,10);
	delay(700);
	printf(", repurposing language and adapting to the space between cultures.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(14,16);
	delay(700);
	printf("One day, nameless limbs, like a fig fallen too soon");
	g(30,18);
	printf("Ebook Price: 160");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();
	  clrscr();

	g(29,3);
	printf("The Wild Fox of Yemen");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p7_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p7_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p7_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p7_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p7_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p7_quantity);
	p7_total = p7_quantity*p7_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p7_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p7_p);

	if(p7_p>=160) {

	p7_change = p7_p - p7_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p7_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");

	} else if(p7_p<160){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}

		} else if(p_c==8) {

	//POETRY EBOOK 8
	clrscr();
	g(32,3);
	printf("Milk and Honey");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("Rupi Kaur's milk and honey is a collection of prose and poetry that");
	g(5,10);
	delay(700);
	printf("explores themes of silence, abuse, womanhood, family, connections and");
	g(5,11);
	delay(700);
	printf("personal power.");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(12,16);
	delay(700);
	printf("Loneliness is a sign you are in desperate need of yourself.");
	g(30,18);
	printf("Ebook Price: 100");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(32,3);
	printf("Milk and Honey");
	g(27,6);
	printf("PURCHASING TRANSACTION");

	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p8_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p8_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p8_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p8_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p8_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p8_quantity);
	p8_total = p8_quantity*p8_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p8_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p8_p);

	if(p8_p>=100) {

	p8_change = p8_p - p8_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p8_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");

	} else if(p8_p<100){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}

		} else if(p_c==9) {

	//POETRY EBOOK 9
	clrscr();
	g(34,3);
	printf("Odyssey");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("The Odyssey is Homer's epic of Odysseus' 10-year struggle to return");
	g(5,10);
	delay(700);
	printf("home after the Trojan War. While Odysseus battles mystical creatures");
	g(5,11);
	delay(700);
	printf("and faces the wrath of the gods");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(19,16);
	delay(700);
	printf("Nothing is bred that is weaker than man.");
	g(30,18);
	printf("Ebook Price: 320");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(34,3);
	printf("Odyssey");
	g(27,6);
	printf("PURCHASING TRANSACTION");
	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p9_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p9_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p9_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p9_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p9_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p9_quantity);
	p9_total = p9_quantity*p9_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p9_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p9_p);
	if(p9_p>=320) {
	p9_change = p9_p - p9_total;
	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p9_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();
	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");
	g(21,14);
	printf("Press Enter to Return to Genre Menu");
	getch();
	clrscr();
	goto genre;

	} else if(p9_p<320){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}
	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}
		} else if(p_c==10) {
			
	//POETRY EBOOK 10
	clrscr();
	g(26,3);
	printf("All Along You Were Blooming");
	g(33,7);
	delay(100);
	printf("Description");
	g(5,9);
	delay(700);
	printf("All Along You Were Blooming is a striking collection of illustrated");
	g(5,10);
	delay(700);
	printf("poetry and prose, inviting you to stumble into the sunlight and delight");
	g(34,14);
	delay(700);
	printf("Tagline");
	g(14,16);
	delay(700);
	printf("One day you will look back and see that all along.");
	g(30,18);
	printf("Ebook Price: 210");
	g(18,21);
	printf("Do you want to buy this Ebook?(1=Yes/2=No)");
	g(30,22);
	printf("Your choice: ");
	scanf("%d",&pchoice);

		if(pchoice==1) {
	  g(20,23);
	  printf("Directing to Purchasing Transaction...");
	  getch();

	clrscr();
	g(26,3);
	printf("All Along You Were Blooming");
	g(27,6);
	printf("PURCHASING TRANSACTION");
	g(13,9);
	printf("Firstname: ");
	g(55,9);
	scanf("%s",&p10_fname);
	g(13,10);
	printf("Lastname: ");
	g(55,10);
	scanf("%s",&p10_lname);
	g(13,11);
	printf("Age: ");
	g(55,11);
	scanf("%d",&p10_age);
	g(13,12);
	printf("Birthday: ");
	g(55,12);
	scanf("%d",&p10_bday);
	g(13,13);
	printf("Email: ");
	g(55,13);
	scanf("%s",&p10_email);
	g(13,14);
	printf("Quantity: ");
	g(55,14);
	scanf("%d",&p10_quantity);
	p10_total = p10_quantity*p10_price;
	g(13,15);
	printf("Total Amount:");
	g(55,15);
	printf("%d",p10_total);
	g(13,16);
	printf("Enter Your Payment: ");
	g(55,16);
	scanf("%d",&p10_p);

	if(p10_p>=210) {

	p10_change = p10_p - p10_total;

	g(13,17);
	printf("Your change:");
	g(55,17);
	printf("%d",p10_change);

	g(33,21);
	printf("Processing.......");
	getch();
	clrscr();

	g(23,11);
	printf("THANK YOU FOR BUYING OUR EBOOK!");

	} else if(p10_p<210){
	g(15,22);
	printf("Insufficient amount, please enter exact amount.");
	getch();
	clrscr();
	}

	} else if(pchoice==2) {
	clrscr();
	goto poetry;
	}
		} else if(p_c==11) {
		clrscr();
		 goto genre;

		} else {
			g(29,23);
			printf("Invalid choice!");
			getch();
			clrscr();
			goto poetry;
		}
		} while(p_c==11);

	  } else if(choice==6) {
	  	//EXIT
		clrscr();
		g(22,10);
		printf("Thank you for using our system!");
		g(15,12);
		printf("A reader lives a thousand lives before he dies.");
		getch();
		exit(0);
	  } else {
	  g(25,23);
	  printf("Invalid choice(1 - 6 only)");
	  getch();
	  clrscr();
	  goto genre;
	  }
	  }while(r_c==11 || m_c==11 || h_c==11 || ss_c==11 || p_c==11);

	getch();
	return 0;

}
