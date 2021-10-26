import firebase from "firebase";

const firebaseConfig = {
  apiKey: "AIzaSyBjtcAO5kq4mIR5iIIzHoXZYaBAAD5qveQ",
  authDomain: "bootcamp-april2021-3bbf9.firebaseapp.com",
  databaseURL: "https://bootcamp-april2021-3bbf9-default-rtdb.firebaseio.com",
  projectId: "bootcamp-april2021-3bbf9",
  storageBucket: "bootcamp-april2021-3bbf9.appspot.com",
  messagingSenderId: "984716894662",
  appId: "1:984716894662:web:0f33a162f9ac309cfed2c7",
  measurementId: "G-TCDHBWY1T1",
};
// Initialize Firebase
firebase.initializeApp(firebaseConfig);

export default firebase;
