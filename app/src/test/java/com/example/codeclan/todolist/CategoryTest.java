package com.example.codeclan.todolist;

import com.example.codeclan.todolist.Category.Category;
import com.example.codeclan.todolist.Category.DefaultCategories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class CategoryTest {

    private DefaultCategories categories;
    private Category category1;
    private Category category2;

    @Before
    public void before(){
        categories = new DefaultCategories();
        category1 = new Category("Packing", R.drawable.packing);
        category2 = new Category("Garden", R.drawable.garden);
    }

    @Test
    public void canGetCategories(){
        assertEquals(4, categories.getSize());
    }

    @Test
    public void canAddCategories(){
        categories.addCategory(category1);
        assertEquals(5, categories.getSize());
    }

    @Test
    public void canGetCategory(){
        assertNotNull(categories.getCategory(1));
    }

}
