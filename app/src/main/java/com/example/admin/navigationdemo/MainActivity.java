package com.example.admin.navigationdemo;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Defining Variables
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing NavigationView
        navigationView = (NavigationView)
                findViewById(R.id.navigation_view);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener
                (new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked())
                    menuItem.setChecked(false);
                else
                    menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.circle_area:
                        Toast.makeText(getApplicationContext(),"circle area Selected",
                                Toast.LENGTH_SHORT).show();
                        CircleAreaFragment fragment = new CircleAreaFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frame,fragment);
                        fragmentTransaction.commit();
                        return true;


                    case R.id.notes_demo:
                        Toast.makeText(getApplicationContext(),"Notes",
                                Toast.LENGTH_SHORT).show();
                        NotesDemoFragment fragmentnotedemo = new NotesDemoFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionnotedemo
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionnotedemo.replace(R.id.frame,fragmentnotedemo);
                        fragmentTransactionnotedemo.commit();
                        return true;
                    // For rest of the options we just show a toast on click


                    case R.id.armstrong_number:
                        Toast.makeText(getApplicationContext(),"Armstrong Number Selected",
                                Toast.LENGTH_SHORT).show();
                        ArmstrongNumberFragment fragmentone = new ArmstrongNumberFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionarmstrongnumber
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionarmstrongnumber.replace(R.id.frame,fragmentone);
                        fragmentTransactionarmstrongnumber.commit();
                        return true;



                    case R.id.arithmatic_operation:
                        Toast.makeText(getApplicationContext(),"ArithmaticOperation Selected",
                                Toast.LENGTH_SHORT).show();
                        ArithmaticOperationFragment fragmentarithmatic = new ArithmaticOperationFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionarithmatic
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionarithmatic.replace(R.id.frame,fragmentarithmatic);
                        fragmentTransactionarithmatic.commit();
                        return true;


                    case R.id.array2d:
                        Toast.makeText(getApplicationContext()," Array2D Selected",
                                Toast.LENGTH_SHORT).show();
                        Array2DFragment fragmentarray2d = new Array2DFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionarray2d
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionarray2d.replace(R.id.frame,fragmentarray2d);
                        fragmentTransactionarray2d.commit();
                        return true;


                    case R.id.arrayoperation:
                        Toast.makeText(getApplicationContext()," ArrayOperation Selected",
                                Toast.LENGTH_SHORT).show();
                        ArrayOperationFragment fragmentarrayoperation = new ArrayOperationFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionarrayopeartion
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionarrayopeartion.replace(R.id.frame,fragmentarrayoperation);
                        fragmentTransactionarrayopeartion.commit();
                        return true;



                    case R.id.gross_salary_calculation:
                        Toast.makeText(getApplicationContext(),"GrossSalaryCalculation Selected",
                                Toast.LENGTH_SHORT).show();
                        GrossSalaryCalculation fragmentgrosssalarycalculation = new GrossSalaryCalculation();
                        android.support.v4.app.FragmentTransaction fragmentTransactiongrosssalarycalculation
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactiongrosssalarycalculation.replace(R.id.frame,fragmentgrosssalarycalculation);
                        fragmentTransactiongrosssalarycalculation.commit();
                        return true;



                    case R.id.check_character:
                        Toast.makeText(getApplicationContext(),"CheckCharacter Selected",
                                Toast.LENGTH_SHORT).show();
                        CheckCharacterFragment fragmentcheckcharacter = new CheckCharacterFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactioncheckcharacter
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactioncheckcharacter.replace(R.id.frame,fragmentcheckcharacter);
                        fragmentTransactioncheckcharacter.commit();
                        return true;


                    case R.id.compare_string:
                        Toast.makeText(getApplicationContext()," CompareString Selected",
                                Toast.LENGTH_SHORT).show();
                        CompareStringFragment fragmentcomparestring = new CompareStringFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactioncomparestring
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactioncomparestring.replace(R.id.frame,fragmentcomparestring);
                        fragmentTransactioncomparestring.commit();
                        return true;



                    case R.id.compound_interest:
                        Toast.makeText(getApplicationContext()," CompoundInterest Selected",
                                Toast.LENGTH_SHORT).show();
                        CompoundInterestFragment fragmentcompoundinterest = new CompoundInterestFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactioncompoundinterest
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactioncompoundinterest.replace(R.id.frame,fragmentcompoundinterest);
                        fragmentTransactioncompoundinterest.commit();
                        return true;

                    case R.id.conversion_length:
                        Toast.makeText(getApplicationContext()," ConversionOfLength Selected",
                                Toast.LENGTH_SHORT).show();
                        ConversionOfLength fragmentconversionlength = new ConversionOfLength();
                        android.support.v4.app.FragmentTransaction fragmentTransactionconversionlength
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionconversionlength.replace(R.id.frame,fragmentconversionlength);
                        fragmentTransactionconversionlength.commit();
                        return true;


                    case R.id.driver_insurance:
                        Toast.makeText(getApplicationContext(),"DriverInsurance Selected",
                                Toast.LENGTH_SHORT).show();
                        DriverInsuranceFragment fragmentdriverinsurance = new DriverInsuranceFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactiondriverinsurance
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactiondriverinsurance.replace(R.id.frame,fragmentdriverinsurance);
                        fragmentTransactiondriverinsurance.commit();
                        return true;

                    case R.id.even_odd:
                        Toast.makeText(getApplicationContext(),"EvenOdd Selected",
                                Toast.LENGTH_SHORT).show();
                        EvenOddFragment fragmentevenodd = new EvenOddFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionevenodd
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionevenodd.replace(R.id.frame,fragmentevenodd);
                        fragmentTransactionevenodd.commit();
                        return true;


                    case R.id.grade_steel:
                        Toast.makeText(getApplicationContext(),"GradeSteel Selected",
                                Toast.LENGTH_SHORT).show();
                        GradeSteelFragment fragmentgradesteel = new GradeSteelFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactiongradesteel
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactiongradesteel.replace(R.id.frame,fragmentgradesteel);
                        fragmentTransactiongradesteel.commit();
                        return true;


                    case R.id.insurance_company:
                        Toast.makeText(getApplicationContext(),"InsuranceCompany Selected",
                                Toast.LENGTH_SHORT).show();
                        InsuranceCompanyFragment fragmentinsurancecompany = new InsuranceCompanyFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactioninsurancecompany
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactioninsurancecompany.replace(R.id.frame,fragmentinsurancecompany);
                        fragmentTransactioninsurancecompany.commit();
                        return true;


                    case R.id.telephony_bill:
                        Toast.makeText(getApplicationContext(),"TelephonyBill Selected",
                                Toast.LENGTH_SHORT).show();
                        TelephonyBillFragment fragmenttelephonybill = new TelephonyBillFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionttelephonybill
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionttelephonybill.replace(R.id.frame,fragmenttelephonybill);
                        fragmentTransactionttelephonybill.commit();
                        return true;

                    case R.id.mycalculator:
                        Toast.makeText(getApplicationContext(),"MyCalculator Selected",
                                Toast.LENGTH_SHORT).show();
                        MyCalculatorFragment fragmentmycalcuator = new MyCalculatorFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionmycalculator
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionmycalculator.replace(R.id.frame,fragmentmycalcuator);
                        fragmentTransactionmycalculator.commit();
                        return true;

                    case R.id.randomnumber:
                        Toast.makeText(getApplicationContext()," RandomNumber Selected",
                                Toast.LENGTH_SHORT).show();
                        RandomNumberFragment fragmentrandom = new RandomNumberFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionrandom
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionrandom.replace(R.id.frame,fragmentrandom);
                        fragmentTransactionrandom.commit();
                        return true;


                    case R.id.simpleinterest:
                        Toast.makeText(getApplicationContext(),"SimpleInterest Selected",
                                Toast.LENGTH_SHORT).show();
                        SimpleInterestFragment fragmentsimpleinterest = new SimpleInterestFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionsimpleinterest
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionsimpleinterest.replace(R.id.frame,fragmentsimpleinterest);
                        fragmentTransactionsimpleinterest.commit();
                        return true;

                    case R.id.studentgrade:
                        Toast.makeText(getApplicationContext(),"StudentGrade Selected",
                                Toast.LENGTH_SHORT).show();
                        StudentGradeFragment fragmentstudentgrade = new StudentGradeFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionstudentgrade
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionstudentgrade.replace(R.id.frame,fragmentstudentgrade);
                        fragmentTransactionstudentgrade.commit();
                        return true;

                    case R.id.swappingarrayelements:
                        Toast.makeText(getApplicationContext(),"SwappingArrayElements Selected",
                                Toast.LENGTH_SHORT).show();
                        SwappingArrayElementsFragment fragmentswappingarrayelements = new SwappingArrayElementsFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionswappingarrayelements
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionswappingarrayelements.replace(R.id.frame,fragmentswappingarrayelements);
                        fragmentTransactionswappingarrayelements.commit();
                        return true;


                    case R.id.calculatetemperature:
                        Toast.makeText(getApplicationContext(),"CalculateTemperature Selected",
                                Toast.LENGTH_SHORT).show();
                        CalculateTemperatureFragment fragmentcalculatetemperature = new CalculateTemperatureFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactioncalculatetemperature
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactioncalculatetemperature.replace(R.id.frame,fragmentcalculatetemperature);
                        fragmentTransactioncalculatetemperature.commit();
                        return true;


                    case R.id.tictactoe:
                        Toast.makeText(getApplicationContext(),"TicTacToe Selected",
                                Toast.LENGTH_SHORT).show();
                        TicTacToeFragment fragmenttictactoe = new TicTacToeFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactiontictactoe
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactiontictactoe.replace(R.id.frame,fragmenttictactoe);
                        fragmentTransactiontictactoe.commit();
                        return true;


                    case R.id.arraytraverse:
                        Toast.makeText(getApplicationContext()," ArrayTraverse Selected",
                                Toast.LENGTH_SHORT).show();
                        ArrayTraverseFragment fragmentarraytraverse = new ArrayTraverseFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransactionarraytraverse
                                = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionarraytraverse.replace(R.id.frame,fragmentarraytraverse);
                        fragmentTransactionarraytraverse.commit();
                        return true;


                    default:
                        Toast.makeText(getApplicationContext(),"Somethings Wrong",Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle
                = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
