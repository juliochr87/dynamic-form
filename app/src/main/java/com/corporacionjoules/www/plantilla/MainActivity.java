package com.corporacionjoules.www.plantilla;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

import utils.objects.GenericObject;
import utils.views.fields.EditTextObjectView;
import utils.views.fields.LabelObjectView;
import utils.views.fields.SpinnerObjectView;
import utils.views.fields.ToggleButtonObject;
import utils.views.layouts.LinearLayoutObjectView;
import utils.views.layouts.RelativeLayoutObjectView;
import utils.views.layouts.TextInputLayoutObjectView;
import utils.views.properties.Properties;
import utils.ws.WebService;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {

    List<GenericObject> tabList;
    List<GenericObject> formList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabList = new WebService().getTabs();
        formList = new WebService().getForms();

        loadMainMenu();

    }

    //Load the skeleton menu
    private void loadMainMenu(){

        Toolbar         toolbar             = (Toolbar)         findViewById(R.id.toolbar);
        DrawerLayout    drawer              = (DrawerLayout)    findViewById(R.id.drawer_layout);
        NavigationView  navigationView      = (NavigationView)  findViewById(R.id.nav_view);
        ViewPager       viewPager           = (ViewPager)       findViewById(R.id.container);
        TabLayout       tabLayout           = (TabLayout)       findViewById(R.id.tabs);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(sectionsPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        showFormMenu(navigationView);


    }

    public void showFormMenu(NavigationView navigationView)
    {
        Menu menu = navigationView.getMenu();

        for (GenericObject genericObject:formList) {
            menu.add(0, 0, 0, genericObject.toString()).setIcon(R.drawable.ic_menu_share);
        }
        menu.addSubMenu("ASDASD");
        menu.setGroupCheckable(0,true,true);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

       /* if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.content_main, container, false);

            int var = getArguments().getInt(ARG_SECTION_NUMBER);
            //TextView textView = (TextView) rootView.findViewById(R.id.textView);
            LinearLayout linearLayout = rootView.findViewById(R.id.linearLayout);
           // textView.setText(getString(R.string.large_text));

            RelativeLayout relativeLayout = (RelativeLayout) new RelativeLayoutObjectView(getContext()).addRelativeLayout();

            View v = new LabelObjectView(getContext()).addLabel(Integer.toString(var));
            new Properties().setPadding(v);

            View v2 = new ToggleButtonObject(getContext()).addToggleButton("inicio","1","2",false);
            new Properties().setPadding(v2);

            String[][] coupleArray = { { "1", "Rose" }, { "2", "Abigail" }, { "3", "Josephine" }, { "4", "Angelina" } };
            View v3 = new SpinnerObjectView(getContext()).addSpinner(coupleArray,false);

            new Properties().setPadding(v3);
            View v4 = new TextInputLayoutObjectView(getContext()).addTextInputLayout(new EditTextObjectView(getContext()).addEditText("Prueba",1, InputType.TYPE_CLASS_PHONE),new LinearLayout.LayoutParams(AppBarLayout.LayoutParams.MATCH_PARENT, AppBarLayout.LayoutParams.MATCH_PARENT));

            new Properties().setPadding(v4);
            List<View> listaView = new ArrayList<>();

            listaView.add(v);
            listaView.add(v2);
            listaView.add(v3);
            listaView.add(v4);

            LinearLayoutObjectView linearLayoutObjectView = new LinearLayoutObjectView(getContext());
            LinearLayout h = (LinearLayout) linearLayoutObjectView.addLinearLayout(false);

            linearLayoutObjectView.addViewsToLinearLayout(listaView,h);

            new Properties().setLayoutMatchParentWidthHeight(h);
            relativeLayout.addView(h);

           // setContentView(relativeLayout);

            linearLayout.addView(relativeLayout);
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {

            return tabList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {

            GenericObject genericObject = tabList.get(position);

            return genericObject.toString();

        }
    }
}
