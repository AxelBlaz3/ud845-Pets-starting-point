package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    public static abstract class PetEntry implements BaseColumns {

        /* Table Name */
        public static String TABLE_NAME = "pets";

        /* IDs for reference */
        public static final String _ID = BaseColumns._ID;

        /* Constants for name of the columns */

        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COULMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /* Constants for identifying the gender of a particular pet */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
