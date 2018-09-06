package nimbl3.surveyapp.view.fragment.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.PagerAdapter
import android.util.Log
import nimbl3.surveyapp.model.Survey
import nimbl3.surveyapp.view.fragment.SurveyFragment

class SurveysPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private var surveys: ArrayList<Survey> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return SurveyFragment.newInstance(surveys[position])
    }

    override fun getItemPosition(item: Any): Int {
        return PagerAdapter.POSITION_NONE
    }

    override fun getCount(): Int {
        return surveys.size
    }

    fun clear() {
        surveys.clear()
        notifyDataSetChanged()
    }

    fun refresh(newSurveys : ArrayList<Survey>) {
        surveys.addAll(newSurveys)
        notifyDataSetChanged()
    }






}