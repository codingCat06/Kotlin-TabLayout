# TabLayout ( + with ViewPagerAdapter )
#  
## Setting TabLayoutMediator( tabLayout, viewPager ) 
        var viewPager = binding.viewpager
        var tabLayout = binding.tabLayout

        viewPager.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()
