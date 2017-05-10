package egaprasetianti.finalproject;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class UnsurActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsur);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_golia(), "IA");
        adapter.addFragment(new Fragment_goliia(), "IIA");
        adapter.addFragment(new Fragment_premium(), "IIA");
        adapter.addFragment(new Fragment_premium(), "IIIA");
        adapter.addFragment(new Fragment_premium(), "IVA");
        adapter.addFragment(new Fragment_premium(), "VA");
        adapter.addFragment(new Fragment_premium(), "VIA");
        adapter.addFragment(new Fragment_premium(), "VIIA");
        adapter.addFragment(new Fragment_premium(), "VIIIA");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String title){
            mFragmentList.add(fragment);
            mFragmentTitle.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }


        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitle.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }
    }
}
