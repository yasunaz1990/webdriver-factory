/*
 * Copyright 2020 Alexei Barantsev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.stqa.selenium.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DefaultLocalDriverProviderTest {

  DefaultLocalDriverProvider provider;
  WebDriver driver;

  @BeforeEach
  void init() {
    provider = new DefaultLocalDriverProvider();
  }

  @Disabled
  @Test
  void canInstantiateFirefoxDriverWithFirefoxOptions() {
    driver = provider.createDriver(new FirefoxOptions());
    assertTrue(driver instanceof FirefoxDriver);
  }

  @Disabled
  @Test
  void canInstantiateChromeDriverWithChromeOptions() {
    driver = provider.createDriver(new ChromeOptions());
    assertTrue(driver instanceof ChromeDriver);
  }

  @AfterEach
  void fin() {
    if (driver != null) {
      driver.quit();
    }
  }
}