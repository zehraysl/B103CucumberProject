Feature: Techproeducation Title Testi
  Scenario: TCO1_sayfanin_baslik_testi
    Given techproeducation sayfasına gidilir
    When sayfa basligi yazdirilir
    Then sayfa basliginda Bootcamp yazisi oldugu test edilir
    And sayfa kapatilir