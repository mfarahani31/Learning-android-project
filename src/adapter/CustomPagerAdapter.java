package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.mainproject.fragments.TabFragment1;
import com.example.mainproject.fragments.TabFragment2;
import com.example.mainproject.fragments.TabFragment3;
import com.example.mainproject.fragments.TabFragment4;


public class CustomPagerAdapter extends FragmentPagerAdapter {

    private final int PAGES = 4;
    private String[] titles={"درباره ما", "اخبار", "جستجو","خانه"};

    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        int resId = 0;
        switch (position) {
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
            case 2:
                return new TabFragment3();
            case 3:
                return new TabFragment4();
            default:
                throw new IllegalArgumentException("The item position should be less or equal to:" + PAGES);

        }
    }
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public int getCount() {
            return PAGES;
        }
    }
