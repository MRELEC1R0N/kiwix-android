/*
 * Kiwix Android
 * Copyright (c) 2019 Kiwix <android.kiwix.org>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.kiwix.kiwixmobile.webserver;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;
import org.kiwix.kiwixmobile.di.PerActivity;

@Module
public class ZimHostModule {

  @PerActivity
  @Provides
  ZimHostContract.Presenter provideZimHostPresenter(ZimHostPresenter zimHostPresenter) {
    return zimHostPresenter;
  }

  @PerActivity
  @Provides Activity providesActivity(ZimHostActivity zimHostActivity) {
    return zimHostActivity;
  }

  @PerActivity
  @Provides LocationServicesHelper providesLocationServicesHelper(ZimHostActivity activity,
    LocationCallbacks locationCallbacks) {
    return new LocationServicesHelper(activity, locationCallbacks);
  }

  @PerActivity
  @Provides LocationCallbacks providesLocationCallbacks(ZimHostActivity activity) {
    return activity;
  }
}

