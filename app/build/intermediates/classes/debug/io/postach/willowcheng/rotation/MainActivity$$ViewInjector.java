// Generated code from Butter Knife. Do not modify!
package io.postach.willowcheng.rotation;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final io.postach.willowcheng.rotation.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230796, "field 'toolbar'");
    target.toolbar = (android.support.v7.widget.Toolbar) view;
    view = finder.findRequiredView(source, 2131230788, "field 'tabs'");
    target.tabs = (com.astuetz.PagerSlidingTabStrip) view;
    view = finder.findRequiredView(source, 2131230789, "field 'pager'");
    target.pager = (android.support.v4.view.ViewPager) view;
  }

  public static void reset(io.postach.willowcheng.rotation.MainActivity target) {
    target.toolbar = null;
    target.tabs = null;
    target.pager = null;
  }
}
