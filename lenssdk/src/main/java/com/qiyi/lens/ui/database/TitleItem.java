/*
 *
 * Copyright (C) 2020 iQIYI (www.iqiyi.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.qiyi.lens.ui.database;


import com.qiyi.lenssdk.R;

public class TitleItem extends BaseItem<String> {
    public TitleItem(String data) {
        super(data);
    }

    @Override
    public void onBinding(int position, CommonDBAdapter.ViewPool pool, String data) {
        pool.setText(R.id.lens_item_title_id, data);
    }

    @Override
    public int getLayout() {
        return R.layout.lens_item_title;
    }
}
