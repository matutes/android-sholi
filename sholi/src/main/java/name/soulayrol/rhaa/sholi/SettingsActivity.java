/*
 * ShoLi, a simple tool to produce short (shopping) lists.
 *
 * Copyright (C) 2014  David Soulayrol
 *
 * ShoLi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ShoLi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package name.soulayrol.rhaa.sholi;

import android.app.Activity;
import android.os.Bundle;


public class SettingsActivity extends Activity {

    public static final String KEY_IMPORT_MERGE_POLICY = "pref_import_merge_policy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
