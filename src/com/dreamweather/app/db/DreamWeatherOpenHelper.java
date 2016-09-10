package com.dreamweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 创建天气数据库表
 * 
 * @author Shur
 *
 */
public class DreamWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * Province表建表语句
	 */
	public static final String CREATE_PROVINCE = "create table Province (" + "id integer primary key autoincrement, "
			+ "province_name text, " + "province_code text)";
	/**
	 * City表建表语句
	 */
	public static final String CREATE_CITY = "create table City (" + "id integer primary key autoincrement, "
			+ "city_name text, " + "city_code text, " + "province_id integer)";
	/**
	 * County表建表语句
	 */
	public static final String CREATE_COUNTY = "create table County (" + "id integer primary key autoincrement, "
			+ "county_name text, " + "county_code text, " + "city_id integer)";

	public DreamWeatherOpenHelper(Context context, String name, CursorFactory factory, int version) {

		super(context, name, factory, version);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);// 创建province表
		db.execSQL(CREATE_CITY);// 创建city表
		db.execSQL(CREATE_COUNTY);// 创建country表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}
