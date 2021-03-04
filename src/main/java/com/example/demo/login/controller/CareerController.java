package com.example.demo.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CareerController {
	
	// プログラミング言語チェックボックス
	private Map<String, Integer> checkProgramingLanguage;
	
	// OSチェックボックス
	private Map<String, Integer> checkOS;
	
	// 担当領域チェックボックス
	private Map<String, Integer> checkJob;
	
	// プログラミング言語チェックボックスの初期化
	private Map<String, Integer> initCheckProgramingLanguage() {
		
		String[] programingLanguages = {
				"Java", 
				"C", 
				"C++", 
				"C#", 
				"Ruby", 
				"SQL", 
				"PHP", 
				"Python", 
				"Go", 
				".NET", 
				"Swift", 
				"Kotlin", 
				"JavaScript", 
				"AWS" 
		};
		
		Map<String, Integer> checkBox = new LinkedHashMap<>();
		
		for (int i = 0; i < programingLanguages.length; i++) {
			checkBox.put(programingLanguages[i], i + 1);
		}
		
		return checkBox;
	}
	
	// OSチェックボックスの初期化
	private Map<String, Integer> initCheckOS() {
		
		String[] OSes = {
				"Windows",
				"MacOS",
				"Linux"
		};
		
        Map<String, Integer> checkBox = new LinkedHashMap<>();
		
		for (int i = 0; i < OSes.length; i++) {
			checkBox.put(OSes[i], i + 1);
		}
		
		return checkBox;
	}
	
	// OSチェックボックスの初期化
		private Map<String, Integer> initCheckJob() {
			
			String[] jobs = {
					"要件定義",
					"基本設計",
					"詳細設計",
					"プログラミング",
					"単体テスト",
					"結合テスト",
					"納品"
			};
			
	        Map<String, Integer> checkBox = new LinkedHashMap<>();
			
			for (int i = 0; i < jobs.length; i++) {
				checkBox.put(jobs[i], i + 1);
			}
			
			return checkBox;
		}
	
	// GET index
	@GetMapping("/careers")
	public String getCareerIndex(Model model) {
		
		// 経歴一覧表示画面
		model.addAttribute("contents", "career/index :: index_contents");
		return "career/template";
	}
	
	// POST logout
	@PostMapping("/logout")
	public String postLogout() {
		return "redirect:/login";
	}
	
	// GET new
	@GetMapping("/new")
	public String getCareerNew(Model model) {
		
		// プログラミング言語チェックボックスをmodelに登録
		checkProgramingLanguage = initCheckProgramingLanguage();
		model.addAttribute("checkProgramingLanguage", checkProgramingLanguage);
		
		// OSチェックボックスをmodelに登録
		checkOS = initCheckOS();
		model.addAttribute("checkOS", checkOS);
		
		// 担当領域チェックボックスをmodelに登録
		checkJob = initCheckJob();
		model.addAttribute("checkJob", checkJob);
		
		// 経歴作成画面
		model.addAttribute("contents", "career/new :: new_contents");
		return "career/template";
	}
	
	// GET show
	@GetMapping("/show")
	public String getCareerShow(/*@PathValiable Long id,*/ Model model) {
		
		// 経歴詳細画面
		model.addAttribute("contents", "career/show :: show_contents");
		return "career/template";
	}
	
	// GET edit
	@GetMapping("/edit")
	public String getCareerEdit(/*@PathVariable Long id,*/ Model model) {
		
		// プログラミング言語チェックボックスをmodelに登録
		checkProgramingLanguage = initCheckProgramingLanguage();
		model.addAttribute("checkProgramingLanguage", checkProgramingLanguage);
				
		// OSチェックボックスをmodelに登録
		checkOS = initCheckOS();
		model.addAttribute("checkOS", checkOS);
				
		// 担当領域チェックボックスをmodelに登録
		checkJob = initCheckJob();
		model.addAttribute("checkJob", checkJob);
		
		// 経歴編集画面
		model.addAttribute("contents", "career/edit :: edit_contents");
		return "career/template";
	}
	
}
