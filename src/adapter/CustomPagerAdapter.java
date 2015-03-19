package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.mainproject.fragments.AboutFragment;
import com.example.mainproject.fragments.NewsFragment;
import com.example.mainproject.fragments.SearchFragment;
import com.example.mainproject.fragments.HomeFragment;


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
                return new AboutFragment();
            case 1:
                return new NewsFragment();
            case 2:
                return new SearchFragment();
            case 3:
                return new HomeFragment();
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
