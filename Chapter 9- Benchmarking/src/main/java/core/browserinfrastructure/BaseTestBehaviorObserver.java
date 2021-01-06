/*
 * Copyright 2021 Automate The Planet Ltd.
 * Author: Anton Angelov
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package core.browserinfrastructure;

import org.testng.ITestResult;

import java.lang.reflect.Method;

public class BaseTestBehaviorObserver implements TestBehaviorObserver{
    private final TestExecutionSubject _testExecutionSubject;

    public BaseTestBehaviorObserver(TestExecutionSubject testExecutionSubject) {
        _testExecutionSubject = testExecutionSubject;
        testExecutionSubject.attach(this);
    }

    @Override
    public void preTestInit(Class<?> currentClass) {
    }

    @Override
    public void postTestInit(Class<?> currentClass) {
    }

    @Override
    public void preTestCleanup(Class<?> currentClass) {
    }

    @Override
    public void postTestCleanup(Class<?> currentClass) {
    }

    @Override
    public void testInstantiated(Class<?> currentClass) {
    }
}
