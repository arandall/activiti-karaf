/*
 * Copyright 2012 Cisco Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.karaf.commands;

import org.activiti.engine.test.Deployment;
import org.junit.Test;

/**
 * @author Srinivasan Chikkala
 */
public class ListActivitiCommandTest extends ActivitiTestCase {

    @Test
    @Deployment(resources = {"diagrams/test-bpm-1.bpmn20.xml", "diagrams/test-bpm-2.bpmn20.xml",
        "diagrams/test-bpm-3.bpmn20.xml"})
    public void testListBPMCommand1() throws Exception {
        ListActivitiCommand listCmd = new ListActivitiCommand();
        listCmd.setProcessEngine(this.getProcessEngine());
        listCmd.doExecute();
    }


}
