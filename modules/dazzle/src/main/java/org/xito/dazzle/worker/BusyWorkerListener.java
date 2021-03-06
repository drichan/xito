// Copyright 2007 Xito.org
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.xito.dazzle.worker;

/**
 * The BusyWorkerListener can be registered with a BusyWorker to receive notification 
 * when a worker has completed its work or is finished
 *  
 * @author deane
 */
public interface BusyWorkerListener {

   /**
    * Called when a BusyWorker that this listener is listening on
    * is complete with its "work" method
    */
   public void workComplete(BusyWorker worker);
   
   /**
    * Called when a BusyWorker is finished. This method will
    * be called in the EventDispatching Thread
    */
   public void workerFinished(BusyWorker worker);
   
   /**
    * Called when a BusyWorker was canceled. This method will be called in the 
    * EventDispatching Thread
    * @param worker
    */
   public void workerCanceled(BusyWorker worker);
}
